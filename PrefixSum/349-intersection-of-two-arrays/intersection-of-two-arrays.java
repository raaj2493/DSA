
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Step 1: Store unique elements
        for (int val : nums1) {
            set1.add(val);
        }

        for (int val : nums2) {
            set2.add(val);
        }

        // Step 2: Store common elements
        ArrayList<Integer> result = new ArrayList<>();

        for (int val : set1) {
            if (set2.contains(val)) {
                result.add(val);
            }
        }

        // Step 3: Convert ArrayList to int[]
        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
