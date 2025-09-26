/* input.java
   📝 Notes:
   • Scanner is used to take user input from the console.
   • nextLine() reads a full line, nextInt() reads an integer.
   • Always close the Scanner to free resources.
   • Use System.out.print() (no newline) or println() (with newline) for prompts.
*/
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read a string
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read an integer
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        sc.close(); // Close Scanner
    }
}
