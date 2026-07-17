public class Min {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        min(arr);
        maxProfit(arr);
        
    }

   static int min(int[]arr){
      int min = arr[0];
      for(int i = 0 ; i<arr.length; i++){
        if (arr[i]<min) {
            min = arr[i];
        }
      }
      System.out.println(min);
      return min;
   }

// ----------============----------Question ------------------------- ----------------------------
   static int maxProfit(int[] prices) {

    // --------------------Finding best time to buy ----------------------------
        int min = prices[0];
      for(int i = 0 ; i<prices.length; i++){
        if (prices[i]<min) {
            min = prices[i];
        }
      }
      System.out.println(min);
   // --------------------Finding best time to Sell ----------------------------
       int max = prices[0];
      for(int i = 0 ; i<prices.length; i++){
        if (prices[i]>max) {
            max = prices[i];
        }
      }
      System.out.println(max);

       int maxprofit = max-min;
    return maxprofit;
    }
   
   
}
