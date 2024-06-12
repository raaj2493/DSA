       // Order Agnostic Binary Search means to find the ascending or descending order of array
       // to apply binary search on.
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arrAsc = {9,8,7,6,5,4,3,2,1};
        int [] arrDsc = {1,2,3,4,5,6,7,8,9};

        int res1 = orderagnosticBS(arrAsc, 8);
        int res2 = orderagnosticBS(arrDsc,8);

        System.out.println(res1);
        System.out.println(res2);
    }

    static int orderagnosticBS(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

         while (start<=end){

             int mid = start+(end - start)/2;

             if (arr[mid] == target) {
                 return mid;
             }

             if (isAsc){
                 if (arr[mid]>target){
                     end = mid-1;
                 } else {
                     start = mid + 1;
                 }
             }  // ye wala run nhi hua matlab array ascending nhi ha to fir descending hoga to descending ka logic run hoga
             else {
                 if (arr[mid]<target){
                     end = mid-1;
                 } else {
                     start = mid + 1;
                 }
             }
         }
        return -1;
    } //
}
