class FindMinimum{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,-7,8};
        System.out.println(minimum(arr));

    }

    static int minimum(int[]arr){
        int minimum = arr[0];
        for (int i = 1; i< arr.length; i++){
            if (arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}