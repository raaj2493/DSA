/* main.java
   📝 Notes:
   • The main() method is the starting point of a Java program.
   • Signature: public static void main(String[] args)
     - public: Accessible by JVM from anywhere.
     - static: Called without creating an object.
     - void: No return value.
     - main: Recognized entry point.
     - String[] args: Array for command-line arguments.
   • Command-line arguments example:
     java Main hello world
     args[0] = "hello", args[1] = "world".
   • Public class name must match filename.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Main method running!");
        for (String arg : args) { // Enhanced for loop
            System.out.println("Arg: " + arg);
        }
    }
}
