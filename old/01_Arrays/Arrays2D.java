import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*
              2D array looks like this

                 1 2 3
                 4 5 6
                 7 8 9

          */

        // Syntax ->  int[][] arr = new int [][]

        int [][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // input 2D arrays

        int[][] arr = new int[3][3];

        for (int row = 0; row< arr.length; row++){     // we enter in 0th row  then coloumb loop is called
            for (int col = 0; col<arr[row].length; col++){   // we get into coloumb loop then 0th row and first coloumb is beung filed then 2nd col of 0th row and soo on , so col of a row is filled then we get out of col loop and row get increse then its col get filled and soo on
                arr[row][col] = sc.nextInt();
            }
        }

            /*
            in this loop first we are on the 1st row then we enter the coloum loop so for 1st row fthe coloumbs are first being filled
            then the coloumb get filled then it get out of the coloumb loop then
            row increse in the row loop we get into 2nd row then its coloumb get filled
             */

        // output/ printing an 2d array

        for (int row = 0; row< arr1.length; row++){
            // for each col in row
            for (int col = 0; col<arr1[row].length; col++){
                System.out.print(arr1[row][col]+ " ");
            }
            System.out.println();
        }

        //----------------------------------------------------------------------------------------------------------------------

        for (int row = 0; row< arr1.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }


        //------------------------------------------------------------------------------------------------------------------------
        // printing using enchanced for loop


        for (int [] a : arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
