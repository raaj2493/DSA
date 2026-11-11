
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        // Store unique elements from nums1
        for (int num : nums1) {
            set.add(num);
        }

        // Collect common unique elements
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int num : nums2) {
            if (set.contains(num)) {
                temp[index++] = num;
                set.remove(num); // Prevent duplicates
            }
        }

        return Arrays.copyOf(temp, index);
    }
}
