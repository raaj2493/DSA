class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];

        // TODO 1: Build the prefix sum array
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // TODO 2: Loop through every index
        for (int i = 0; i < nums.length; i++) {
            
            // TODO 3: Compute leftSum & rightSum
            
            // If i == 0, there are no elements to the left, so leftSum = 0
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            
            // Total sum of array is prefix[nums.length - 1].
            // Right sum is (total sum) - (prefix sum up to current index i)
            int rightSum = prefix[nums.length - 1] - prefix[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        // TODO 4: No pivot found
        return -1;
    }
}