package Patterns.TwoPointers.Questions;

public class removeduplicates {
    public static void main(String[] args) {
        
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // index of last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // number of unique elements
    }
}
