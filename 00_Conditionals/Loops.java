/* loops.java
   📝 Notes:
   • Loops repeat code multiple times to avoid redundancy.
   • Common types:
     1. Traditional for loop – Standard index-based iteration.
     2. Enhanced for loop (for-each) – Iterates directly over arrays/collections.
     3. Infinite for loop – Runs forever unless stopped with break.
     4. Nested loops – Loops inside loops for multi-level iteration.
     5. while loop – Condition checked before each iteration.
     6. do-while loop – Executes at least once, condition checked after.
     • Use break to exit a loop early and continue to skip an iteration.
*/
class Loops {
    public static void main(String[] args) {

        /* ✅ TRADITIONAL FOR LOOP */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Traditional for loop: " + i);
        }

        /* ✅ ENHANCED FOR LOOP (FOR-EACH) */
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Enhanced for loop (fruit): " + fruit);
        }

        /* ✅ INFINITE FOR LOOP (WITH BREAK) */
        int counter = 0;
        for (;;) { // No init, condition, or increment
            System.out.println("Infinite loop iteration: " + counter);
            counter++;
            if (counter == 3) break; // Prevents infinite execution
        }

        /* ✅ NESTED FOR LOOP */
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("[" + row + "," + col + "] ");
            }
            System.out.println(); // New line after each row
        }

        /* ✅ WHILE LOOP */
        int count = 1;
        while (count <= 3) {
            System.out.println("While loop count: " + count);
            count++;
        }

        /* ✅ DO-WHILE LOOP */
        int num = 1;
        do {
            System.out.println("Do-while loop number: " + num);
            num++;
        } while (num <= 2);

        /* ✅ BREAK & CONTINUE USAGE */
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 using continue");
                continue;
            }
            if (i == 5) {
                System.out.println("Breaking at 5");
                break;
            }
            System.out.println("Loop value: " + i);
        }
    }
}
