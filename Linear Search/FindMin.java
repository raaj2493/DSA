public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        search(arr);
    }

    static int search(int[]arr){
        int min = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
                System.out.println(min);
            }
        }
        return -1;
    }

}
