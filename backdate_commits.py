#!/usr/bin/env python3
"""
GitHub Backdated Commit Tool
Usage: python backdate_commits.py
"""

import subprocess
import random
import sys
from datetime import datetime, timedelta


def run(cmd, env=None):
    result = subprocess.run(cmd, shell=True, capture_output=True, text=True, env=env)
    if result.returncode != 0:
        print(f"Error: {result.stderr.strip()}")
        sys.exit(1)
    return result.stdout.strip()


def parse_date(s):
    for fmt in ("%Y-%m-%d", "%d-%m-%Y", "%d/%m/%Y"):
        try:
            return datetime.strptime(s, fmt)
        except ValueError:
            pass
    raise ValueError(f"Unrecognized date format: {s}")


def date_range(start, end):
    days = (end - start).days + 1
    return [start + timedelta(days=i) for i in range(days)]


def make_commit(dt, message, file_name="activity.log"):
    date_str = dt.strftime("%a %b %d %H:%M:%S %Y +0000")
    import os
    env = os.environ.copy()
    env["GIT_AUTHOR_DATE"] = date_str
    env["GIT_COMMITTER_DATE"] = date_str

    # Append a line to the file so there's always a real change
    with open(file_name, "a") as f:
        f.write(f"{dt.isoformat()} - {message}\n")

    subprocess.run(f'git add {file_name}', shell=True)
    result = subprocess.run(
        f'git commit -m "{message}"',
        shell=True, capture_output=True, text=True, env=env
    )
    if result.returncode != 0:
        print(f"  Commit failed: {result.stderr.strip()}")
    else:
        print(f"  Committed: [{dt.strftime('%Y-%m-%d %H:%M')}] {message}")


def get_input(prompt, default=None):
    val = input(prompt).strip()
    return val if val else default


def main():
    print("\n=== GitHub Backdated Commit Tool ===\n")

    # Check we're inside a git repo
    try:
        run("git rev-parse --is-inside-work-tree")
    except SystemExit:
        print("Not inside a git repo. Run: git init && git remote add origin <url>")
        sys.exit(1)

    # --- Mode ---
    print("Mode:")
    print("  1. Single date")
    print("  2. Date range (fixed commits per day)")
    print("  3. Date range (random commits per day)")
    mode = get_input("Choose [1/2/3]: ", "1")

    # --- Dates ---
    if mode == "1":
        d = get_input("Date (YYYY-MM-DD): ", datetime.today().strftime("%Y-%m-%d"))
        start = end = parse_date(d)
    else:
        start = parse_date(get_input("Start date (YYYY-MM-DD): "))
        end   = parse_date(get_input("End date   (YYYY-MM-DD): "))
        if end < start:
            start, end = end, start

    # --- Commits per day ---
    if mode == "1":
        n_commits = int(get_input("Number of commits for this date: ", "3"))
        min_c = max_c = n_commits
    elif mode == "2":
        n_commits = int(get_input("Commits per day: ", "3"))
        min_c = max_c = n_commits
    else:
        min_c = int(get_input("Min commits per day: ", "1"))
        max_c = int(get_input("Max commits per day: ", "5"))

    # --- Commit message ---
    print("\nCommit message options:")
    print("  1. Same message every commit")
    print("  2. Auto-generated (date-stamped)")
    print("  3. Custom list (one per line, cycles through them)")
    msg_mode = get_input("Choose [1/2/3]: ", "2")

    if msg_mode == "1":
        base_msg = get_input("Commit message: ", "Update")
        messages = [base_msg]
    elif msg_mode == "2":
        messages = None  # generated per commit
    else:
        print("Enter messages (empty line to finish):")
        messages = []
        while True:
            m = input("  > ").strip()
            if not m:
                break
            messages.append(m)
        if not messages:
            messages = ["Update"]

    # --- File name ---
    file_name = get_input("\nFile to commit to [activity.log]: ", "activity.log")

    # --- Confirm ---
    days = date_range(start, end)
    print(f"\nSummary:")
    print(f"  Dates   : {start.date()} → {end.date()} ({len(days)} day(s))")
    print(f"  Commits : {min_c}–{max_c} per day")
    print(f"  File    : {file_name}")
    confirm = get_input("\nProceed? [y/N]: ", "n")
    if confirm.lower() != "y":
        print("Aborted.")
        sys.exit(0)

    # --- Make commits ---
    print()
    total = 0
    msg_idx = 0
    for day in days:
        n = random.randint(min_c, max_c)
        print(f"[{day.date()}] — {n} commit(s)")
        # Spread commits across random times during the day
        times = sorted(random.randint(0, 86399) for _ in range(n))
        for t in times:
            commit_dt = day + timedelta(seconds=t)
            if msg_mode == "2":
                msg = f"Update {commit_dt.strftime('%Y-%m-%d')}"
            else:
                msg = messages[msg_idx % len(messages)]
                msg_idx += 1
            make_commit(commit_dt, msg, file_name)
            total += 1

    # --- Push ---
    print(f"\nDone! {total} commit(s) created.")
    push = get_input("Push to origin now? [y/N]: ", "n")
    if push.lower() == "y":
        branch = get_input("Branch name [main]: ", "main")
        print(f"Pushing to origin/{branch}...")
        run(f"git push origin {branch}")
        print("Pushed successfully.")
    else:
        print("Run manually: git push origin <branch>")


if __name__ == "__main__":
    main()
