class Solution {
    public boolean isPalindrome(String s) {
        // Remove everything except letters and digits
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        // Convert to lowercase
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}