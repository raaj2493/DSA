public class Max {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        max(arr);
        maxinrange(arr,2,5);
    }
    static int max (int[]arr){
        int max = arr[0];
        for (int i= 0; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }

    // max in a range
    static int maxinrange (int[]arr, int start, int end){
        int max = arr[start];
        for (int i= start; i<= end; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }

}
