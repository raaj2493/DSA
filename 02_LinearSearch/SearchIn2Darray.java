import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(search(arr,7)));
    }

    static int[] search(int[][]arr, int target){
        for (int row = 0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                if (arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }


    // leetcode
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i< nums.length; i++){
            if (
                    nums[i]==nums[i+1])
                return true;

        } return false;
    }

}