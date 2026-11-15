class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for( int val : nums){
            if(!set.add(val)){
                return true;
            }
        }
        return false ;
    }
}