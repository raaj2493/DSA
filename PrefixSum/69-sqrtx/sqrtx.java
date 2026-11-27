class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int start = 1;
        int end = x;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Use long to avoid integer overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid;

            } else if (square < x) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}