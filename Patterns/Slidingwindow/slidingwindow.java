package Patterns.Slidingwindow;


    /**
 * ============================================================
 *                SLIDING WINDOW – COMPLETE GUIDE
 * ============================================================
 *
 * ❓ WHAT IS SLIDING WINDOW?
 * Sliding Window is an optimization technique used to process
 * contiguous subarrays or substrings in O(n) time instead of O(n²).
 *
 * We maintain a window using two pointers:
 * - left  → start of window
 * - right → end of window
 *
 * ------------------------------------------------------------
 * ✅ WHEN TO USE SLIDING WINDOW
 * ------------------------------------------------------------
 * Use Sliding Window when:
 *
 * 1. The problem talks about:
 *    - Subarray / Substring
 *    - Contiguous elements
 *
 * 2. You see keywords like:
 *    - "longest", "shortest", "maximum", "minimum"
 *    - "at most K", "exactly K", "at least K"
 *
 * 3. Brute force solution looks like:
 *    - Two nested loops checking all subarrays
 *
 * 4. Window condition depends on:
 *    - Count
 *    - Sum
 *    - Frequency
 *
 * ❌ DO NOT USE when:
 * - Subsequence (not contiguous)
 * - Need all combinations
 *
 * ------------------------------------------------------------
 * 🧠 HOW TO IDENTIFY SLIDING WINDOW IN A QUESTION
 * ------------------------------------------------------------
 * Ask yourself:
 *
 * 1. Is the data contiguous? → YES
 * 2. Am I asked to optimize subarray/substring? → YES
 * 3. Can I expand and shrink based on a condition? → YES
 *
 * If all YES → Sliding Window
 *
 * ------------------------------------------------------------
 * 🔥 TYPES OF SLIDING WINDOW
 * ------------------------------------------------------------
 *
 * 1️⃣ FIXED SIZE WINDOW
 * - Window size (k) is given
 * - Example:
 *   - Max sum subarray of size k
 *
 * 2️⃣ VARIABLE SIZE WINDOW
 * - Window size changes
 * - Example:
 *   - Longest substring with at most k distinct characters
 *
 * 3️⃣ EXACT K WINDOW
 * - Use:
 *   EXACTLY K = AT MOST K − AT MOST (K − 1)
 *
 * 4️⃣ MINIMUM WINDOW
 * - Shrink aggressively once valid
 *
 * ------------------------------------------------------------
 * ⏱️ TIME & SPACE COMPLEXITY
 * ------------------------------------------------------------
 * Time: O(n)
 * - Each element enters window once
 * - Each element exits window once
 *
 * Space:
 * - O(1) → counters
 * - O(k) → frequency map
 *
 * ------------------------------------------------------------
 * 🧪 COMMON MISTAKES
 * ------------------------------------------------------------
 * ❌ Shrinking before window becomes invalid
 * ❌ Forgetting to update answer after shrinking
 * ❌ Using nested loops unnecessarily
 *
 * ------------------------------------------------------------
 * 🧩 UNIVERSAL QUESTIONS TO ASK WHILE CODING
 * ------------------------------------------------------------
 * 1. When do I expand?
 * 2. When do I shrink?
 * 3. What makes my window invalid?
 * 4. What am I tracking inside the window?
 * 5. When do I update the answer?
 */

import java.util.HashMap;
import java.util.Map;

public class slidingwindow {

    // =========================================================
    // 1️⃣ FIXED SIZE WINDOW TEMPLATE
    // =========================================================
    /*
     * WHEN TO USE:
     * - Window size is constant (k)
     *
     * STEPS:
     * 1. Expand window until size k
     * 2. Update answer
     * 3. Shrink from left
     */

    public static int fixedWindow(int[] arr, int k) {
        int left = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int right = 0; right < arr.length; right++) {

            // EXPAND → include right element
            windowSum += arr[right];

            // SHRINK → maintain window size
            if (right - left + 1 > k) {
                windowSum -= arr[left];
                left++;
            }

            // UPDATE ANSWER when window size == k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }

    // =========================================================
    // 2️⃣ VARIABLE SIZE WINDOW (AT MOST K)
    // =========================================================
    /*
     * WHEN TO USE:
     * - Longest / shortest
     * - Condition like "at most K"
     *
     * LOGIC:
     * - Expand window
     * - If invalid → shrink until valid
     * - Update answer
     */

    public static int variableWindowAtMostK(String s, int k) {
        int left = 0, maxLen = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            // EXPAND
            char rc = s.charAt(right);
            freq.put(rc, freq.getOrDefault(rc, 0) + 1);

            // SHRINK when invalid
            while (freq.size() > k) {
                char lc = s.charAt(left);
                freq.put(lc, freq.get(lc) - 1);
                if (freq.get(lc) == 0) freq.remove(lc);
                left++;
            }

            // UPDATE ANSWER (window is valid here)
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // =========================================================
    // 3️⃣ EXACTLY K WINDOW
    // =========================================================
    /*
     * TRICK:
     * EXACTLY K = AT MOST K − AT MOST (K − 1)
     */

    public static int exactlyK(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private static int atMostK(int[] nums, int k) {
        int left = 0, count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {

            // EXPAND
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // SHRINK
            while (freq.size() > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) freq.remove(nums[left]);
                left++;
            }

            // ALL subarrays ending at right are valid
            count += right - left + 1;
        }
        return count;
    }

    // =========================================================
    // 4️⃣ MINIMUM WINDOW TEMPLATE
    // =========================================================
    /*
     * WHEN TO USE:
     * - Find smallest window satisfying condition
     *
     * DIFFERENCE:
     * - Shrink as much as possible once valid
     */

    public static String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);

        int left = 0, matched = 0;
        int minLen = Integer.MAX_VALUE, start = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            if (need.containsKey(c)) {
                need.put(c, need.get(c) - 1);
                if (need.get(c) >= 0) matched++;
            }

            // SHRINK once window is valid
            while (matched == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                if (need.containsKey(lc)) {
                    need.put(lc, need.get(lc) + 1);
                    if (need.get(lc) > 0) matched--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

