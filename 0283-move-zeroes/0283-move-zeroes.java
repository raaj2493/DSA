class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] != 0){
                nums[left] = nums[right];
                left++;
            }
        }
    }
}