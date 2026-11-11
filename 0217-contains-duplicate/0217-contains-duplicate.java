import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uni = new HashSet<>();

        for (int val : nums) {
            if (!uni.add(val)) {
                return true;
            }
        }

        return false;
    }
}