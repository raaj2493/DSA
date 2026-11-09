class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Calculate the first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int high = k; high < nums.length; high++) {

            sum -= nums[high - k]; // Remove outgoing element
            sum += nums[high];     // Add incoming element

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}