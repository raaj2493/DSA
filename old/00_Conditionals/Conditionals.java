/* conditionals.java
   📝 Notes:
   • Conditionals control the flow of execution based on conditions (true/false).
   • Common conditional statements:
     1. if – Runs a block if a condition is true.
     2. if-else – Adds an alternative block if the condition is false.
     3. else-if ladder – Checks multiple conditions in sequence.
     4. switch – Compares a single value against multiple cases (good for many options).
   • Comparison operators: ==, !=, >, <, >=, <=.
   • Logical operators: && (AND), || (OR), ! (NOT).
*/
class Conditionals {
    public static void main(String[] args) {

        int num = 15;

        /* ✅ IF STATEMENT */
        if (num > 10) {
            System.out.println("Number is greater than 10.");
        }

        /* ✅ IF-ELSE STATEMENT */
        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }

        /* ✅ ELSE-IF LADDER */
        if (num < 0) {
            System.out.println("Negative number.");
        } else if (num == 0) {
            System.out.println("Zero.");
        } else {
            System.out.println("Positive number.");
        }

        /* ✅ SWITCH STATEMENT */
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        /* ✅ TERNARY OPERATOR (Short form of if-else) */
        String result = (num > 20) ? "Greater than 20" : "20 or less";
        System.out.println(result);
    }
}
