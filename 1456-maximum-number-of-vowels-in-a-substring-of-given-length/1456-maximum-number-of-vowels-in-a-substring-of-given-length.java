
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int count = 0;
        int maxVowel = 0;

        // Step 1: Build the first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }

        maxVowel = count;

        // Step 2: Slide the window
        for (int high = k; high < s.length(); high++) {

            // Remove outgoing character
            if (vowels.contains(s.charAt(high - k))) {
                count--;
            }

            // Add incoming character
            if (vowels.contains(s.charAt(high))) {
                count++;
            }

            // Update maximum
            maxVowel = Math.max(maxVowel, count);
        }

        return maxVowel;
    }
}
