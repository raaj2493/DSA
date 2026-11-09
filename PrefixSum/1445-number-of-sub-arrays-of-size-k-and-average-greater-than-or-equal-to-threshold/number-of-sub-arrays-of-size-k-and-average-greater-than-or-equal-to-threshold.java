class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int sum = 0;

        // Calculate the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / k;

        if (avg >= threshold) {
            count++;
        }

        // Slide the window
        for (int high = k; high < arr.length; high++) {

            sum -= arr[high - k]; // Remove outgoing element
            sum += arr[high];     // Add incoming element

            avg = (double) sum / k;

            if (avg >= threshold) {
                count++;
            }
        }

        return count;
    }
}