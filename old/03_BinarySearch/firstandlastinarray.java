public class firstandlastinarray {
    public static void main(String[] args) {
        
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] ans = new int[]{-1,-1};
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    static int search(int[] nums, int target, boolean  isFirst) {
        int ans = -1;
int start = 0;
        int end = nums.length-1;

        while (start<=end){

            int mid = start+(end - start)/2;

            if (nums[mid]<target){
                start = mid+1;
            } else if (nums[mid]>target){
                end = mid-1;
            } else {
                // ans found
                ans = mid;
                if (isFirst){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
       return ans;
    }
}
