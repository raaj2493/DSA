public class patterns {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("1.");
        pattern1(5);
        System.out.println("-------------------------------");
          System.out.println("2.");
        pattern2(5);
          System.out.println("-------------------------------");
         System.out.println("3.");
        pattern3(5);
         System.out.println("-------------------------------");
          System.out.println("-------------------------------");
         System.out.println("3.");
        pattern4(5);
         System.out.println("-------------------------------");

         int nums [] = {0,1,2,3,4,5,6,7,8};
       
       
    }

   /* 
    
1.  *****
    *****
    *****
    *****
    *****


    */

    static void pattern1(int n){
       for(int row = 1 ; row <= n ; row++){
       for(int col = 1 ; col <= n; col ++){
        System.out.print("*");
       }
       System.out.println();
       }
    }


    /* 
     
2.  *
    **
    ***
    ****
    *****
    
     */


     static void pattern2(int n ){
        for(int row = 1; row <= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     /* 
     
 3.  *****
     ****
     ***
     **
     *

      */

      static void pattern3(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1; col <= n-row+1 ; col++){
                System.out.print("x");
            }
            System.out.println();
        }
      }

      /* 

 4.  1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5

       */

       static void pattern4(int n){
         for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col <= row; col++){
                System.out.print(col + " ");
            //    n++;
            }
            System.out.println();
         }
       }
}
