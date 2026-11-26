
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int count = 0;
        int maxVowel = 0;

        // travese first window 
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        maxVowel = count ; 

        // slide the window 
        for(int high = k ; high < s.length() ; high++){
            if(vowels.contains(s.charAt(high-k))){
                count--;
            }
            if(vowels.contains(s.charAt(high))){
                count++;
            }
        // Update maximum
            maxVowel = Math.max(maxVowel, count);
        }

        return maxVowel;
    }
}
