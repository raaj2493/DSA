public class Searchinrange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        search(arr,1,4,3);
    }
    static int search(int[] arr , int start, int end, int target){

        if (arr.length==0){
            return -1;
        }


        for (int index = start; index<= end; index++){
            int element = arr[index];
            if (element==target){
                System.out.println(index);
                return index;
            }

        }
        return -1;
    }
}
