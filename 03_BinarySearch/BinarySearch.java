
public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,10,12,13,14};
       int ans= Binarysearch(arr,12);
        System.out.println(ans);
    }
    static int Binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start+(end - start)/2;

            if (arr[mid]<target){
                start = mid+1;
            } else if (arr[mid]>target){
                end = mid-1;
            } else {
                // ans found
                return mid;
            }
        }
       return -1;
    }
}
