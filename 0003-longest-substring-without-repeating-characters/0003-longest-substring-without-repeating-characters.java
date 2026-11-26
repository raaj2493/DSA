class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet set = new HashSet();
        int left = 0 ;
        int maxLength = 0;

        for(int right = 0 ; right < s.length() ; right++){
             char current = s.charAt(right);
        while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}