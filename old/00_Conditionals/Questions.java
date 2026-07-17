/* questions.java
   📝 Basic Java practice problems with normal, beginner-friendly solutions.
   Problems:
     1. Find the largest of 3 numbers
     2. Check if an alphabet is uppercase or lowercase
     3. Fibonacci numbers
     4. Count occurrences of a digit in a number
     5. Reverse a number
*/
import java.util.Scanner;

class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 1️⃣ Find the largest of three numbers */
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("Largest number is: " + largest);

        /* 2️⃣ Alphabet case check */
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter.");
        } else {
            System.out.println("Not an alphabet.");
        }

        /* 3️⃣ Fibonacci numbers */
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        /* 4️⃣ Count occurrences of a digit in a number */
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        int temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            if (remainder == digit) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("Digit " + digit + " occurs " + count + " times.");

        /* 5️⃣ Reverse a number */
        System.out.print("Enter a number to reverse: ");
        int num2 = sc.nextInt();

        int reverse = 0;
        while (num2 != 0) {
            int remainder = num2 % 10;
            reverse = reverse * 10 + remainder;
            num2 = num2 / 10;
        }
        System.out.println("Reversed number is: " + reverse);

        sc.close();
    }
}
