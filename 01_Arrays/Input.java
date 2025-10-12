import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner pScanner = new Scanner(System.in);

        // input an array
        // normal way
        int[] a = new int[2];
        a[0] = 1;
        a[1] = 2;

        // using for loop;
        int[] arr = new int[5];  // Added the missing semicolon here
        for (int i = 0; i < arr.length; i++) {  // Corrected the typo from 'lenght' to 'length'
            arr[i] = pScanner.nextInt();
        }
        System.out.println(arr);

        // using enhcnaced for loop
        for (int num: arr){
            System.out.println(num);
        }

    }
}
