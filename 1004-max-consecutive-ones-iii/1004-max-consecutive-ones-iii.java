
class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroBudget = k;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroBudget--;
            }

            while (zeroBudget < 0) {

                if (nums[left] == 0) {
                    zeroBudget++;
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
