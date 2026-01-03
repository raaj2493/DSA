package Patterns.TwoPointers.Questions;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] result = twoSum(numbers, 10);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }

        return new int[]{-1, -1};
    }
}
