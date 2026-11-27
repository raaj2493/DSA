class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int total = prefix[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = total - prefix[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}