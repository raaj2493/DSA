class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }

    private String process(String s) {
        char[] chars = s.toCharArray();
        int left = 0;

        for (int right = 0; right < chars.length; right++) {
            if (chars[right] == '#') {
                if (left > 0) {
                    left--;
                }
            } else {
                chars[left] = chars[right];
                left++;
            }
        }

        return new String(chars, 0, left);
    }
}