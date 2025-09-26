/* typecasting.java
   📝 Notes:
   • Type casting converts one data type to another.
   • Widening casting (small → large type) is automatic (e.g., int → double).
   • Narrowing casting (large → small type) is manual with (type).
   • Narrowing can lose precision.
*/
class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // Widening (safe, automatic)
        double x = 9.78;
        int y = (int) x; // Narrowing (manual, fractional part lost)
        System.out.println("Double b: " + b);
        System.out.println("Int y: " + y);
    }
}
