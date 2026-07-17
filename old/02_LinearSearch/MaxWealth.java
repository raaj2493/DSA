public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5}
        };
        maximumWealth(accounts);
    }

      static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        // outer loop iterate over row 
        for (int row = 0 ; row<accounts.length ; row++){
           int sum = 0;
           for(int col = 0 ; col<accounts[row].length; col++){
            sum = sum + accounts[row][col];
           }
            if (sum > ans) {
            ans = sum;
        }
        }
        System.out.println(ans);
        return ans;
       
    }
}




















// class MaxWealth{
//     public static void main(String[] args) {
        
//     }

//     public int maximumWealth(int[][] accounts) {
//     int ans = Integer.MIN_VALUE;

//     // Outer loop → iterate over rows (each person)
//     for (int i = 0; i < accounts.length; i++) {
//         int sum = 0;

//         // Inner loop → iterate over columns (each account of that person)
//         for (int j = 0; j < accounts[i].length; j++) {
//             sum += accounts[i][j];
//         }

//         // Compare with max so far
//         if (sum > ans) {
//             ans = sum;
//         }
//     }

//     return ans;
// }
// }