public class floor {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,8,9};
        int target = 7;
        System.out.println(floor(arr, target));
    }
    static int floor(int[] arr, int target){
        int start = arr[0];
        int end = arr.length-1;
        while (start <= end) {
            int mid = start+(end-start)/2;
            if (target > arr[mid]) {
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
