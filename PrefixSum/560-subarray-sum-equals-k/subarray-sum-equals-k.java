class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int count = 0;

        // Build prefix sum array
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Generate all subarrays
        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {

                int sum;

                if (left == 0) {
                    sum = prefix[right];
                } else {
                    sum = prefix[right] - prefix[left - 1];
                }

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}