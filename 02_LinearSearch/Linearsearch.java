public class Linearsearch {
    public static void main(String[] args) {
       int[]arr = {12,2,342,3,245,346,45};
        System.out.println(search(arr, 45));
    }
    static int search (int[]arr, int target){
        // search in the array then return the index number
        // if not exist return -1
        if (arr.length==0){
            return -1;
        }
          // run a for loop for comparing every element with target
        for (int index = 0; index< arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // if no element match then it will return -1
        return -1;
    }
}
