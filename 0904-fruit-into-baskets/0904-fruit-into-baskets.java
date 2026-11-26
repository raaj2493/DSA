
class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {

            int current = fruits[right];

            map.put(current, map.getOrDefault(current, 0) + 1);

            while (map.size() > 2) {

                int outgoing = fruits[left];

                map.put(outgoing, map.get(outgoing) - 1);

                if (map.get(outgoing) == 0) {
                    map.remove(outgoing);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
