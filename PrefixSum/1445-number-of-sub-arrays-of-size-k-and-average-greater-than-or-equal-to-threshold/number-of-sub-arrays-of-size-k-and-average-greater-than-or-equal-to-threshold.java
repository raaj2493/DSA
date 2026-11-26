class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int avg = sum / k;

        if (avg >= threshold) {
            count++;
        }

        // Slide the window
        for (int high = k; high < arr.length; high++) {
            sum -= arr[high - k];
            sum += arr[high];

            avg = sum / k;

            if (avg >= threshold) {
                count++;
            }
        }

        return count;
    }
}