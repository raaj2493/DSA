class Minimum{
    public static void main(String[] args) {
    int [] arr = { 12,44534, 1, -5,9, 17,69 };
    }

    static int findminimun(int[]arr, int min){
        // asssume arr.lengh !=0
        int minimum = arr[0];
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] < minimum){
                min = arr[i];
            }
        }
return min;
    }
}