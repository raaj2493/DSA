public class debugexample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                System.out.println("Skipping 3");
                continue;
            }

            if (i == 7) {
                System.out.println("Breaking at 7");
                break;
            }

            System.out.println("i = " + i);
        }

        System.out.println("Program ended");
    }
}