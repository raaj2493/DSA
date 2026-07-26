class Solution {
    public int removeDuplicates(int[] nums) {

        // Edge case: if the array is empty
        if (nums.length == 0) {
            return 0;
        }

        // 'write' points to the last unique element
        int write = 0;

        // 'read' scans the array
        for (int read = 1; read < nums.length; read++) {

            // Found a new unique element
            if (nums[read] != nums[write]) {

                // Move write to the next position
                write++;

                // Place the unique element there
                nums[write] = nums[read];
            }
        }

        // Number of unique elements
        return write + 1;
    }
}