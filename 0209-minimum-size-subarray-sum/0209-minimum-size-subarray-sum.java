
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int high = 0; high < nums.length; high++) {

            // Expand the window
            sum += nums[high];

            // Shrink while the window is valid
            while (sum >= target) {

                int length = high - low + 1;

                minLength = Math.min(minLength, length);

                sum -= nums[low];
                low++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
