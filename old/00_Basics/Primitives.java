/* primitives.java
   📝 Notes:
   • Java has 8 primitive data types:
     byte, short, int, long, float, double, char, boolean.
   • byte/short/int/long store integers with varying sizes.
   • float/double store decimal values (float less precise).
   • char stores a single Unicode character.
   • boolean stores true or false.
   • Choose types based on memory efficiency and range.
*/
class Primitives {
    public static void main(String[] args) {
        byte b = 100;     // Range: -128 to 127
        short s = 32000;  // Larger than byte
        int i = 50000;    // Default for integers
        long l = 150000L; // Suffix L for long
        float f = 5.75f;  // Suffix f for float
        double d = 19.99; // Default for decimals
        char c = 'A';     // Single character
        boolean flag = true; // true or false
        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d + " " + c + " " + flag);
    }
}
