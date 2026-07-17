class SearchinRange{
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5,6,7,8,9};
       int target = 7;
        System.out.println(Searchinrange(arr,1,8,target));
    }

    static int Searchinrange(int[]arr , int start , int end , int target){
        if (arr.length==0){
            return -1;
        } else {
            for (int index = start ; index <= end ; index ++){
                if (arr[index]==target){
                    return index;
                }
            }
        }
        return -1;
    }
}