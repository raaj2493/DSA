class Solution {
    public boolean isPerfectSquare(int num) {

        if (num < 2) {
            return true;
        }

        int start = 1;
        int end = num / 2;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long square = (long) mid * mid;

            if (square == num) {
                return true;

            } else if (square < num) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}