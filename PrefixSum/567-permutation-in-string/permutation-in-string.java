
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        // Build frequency array for s1
        for (int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
        }

        int k = s1.length();

        // Build the first window
        for (int i = 0; i < k; i++) {
            windowFreq[s2.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(s1Freq, windowFreq)) {
            return true;
        }

        // Slide the fixed-size window
        for (int right = k; right < s2.length(); right++) {

            // Add incoming character
            windowFreq[s2.charAt(right) - 'a']++;

            // Remove outgoing character
            windowFreq[s2.charAt(right - k) - 'a']--;

            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
        }

        return false;
    }
}
