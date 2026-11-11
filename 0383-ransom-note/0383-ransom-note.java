class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character, Integer> map = new HashMap<>();
        // count magzine charector frequency 
        for(char ch : magazine.toCharArray()){
             map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
// Step 2: Consume frequencies using ransomNote
        for (char ch : ransomNote.toCharArray()) {

            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}