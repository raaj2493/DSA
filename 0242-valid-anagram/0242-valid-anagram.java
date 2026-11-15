import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // 1. Count characters in s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 2. Subtract characters in t
        for (char ch : t.toCharArray()) {
            int count = map.getOrDefault(ch, 0);
            if (count == 0) {
                return false; // Either missing or appeared too many times
            }
            map.put(ch, count - 1);
        }

        return true;
    }
}