public class OrderAgnosticBinarySearch {

    // Function to perform order agnostic binary search
    public static int orderAgnosticBinarySearch(int[] arr, int target) {

        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Check whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        // Standard binary search loop
        while (start <= end) {

            // Calculate mid (use this form to avoid integer overflow)
            int mid = start + (end - start) / 2;

            // If target element found, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If array is ascending
            if (isAscending) {
                if (target < arr[mid]) {
                    // Target lies in left half
                    end = mid - 1;
                } else {
                    // Target lies in right half
                    start = mid + 1;
                }
            } else {
                // If array is descending
                if (target > arr[mid]) {
                    // Target lies in left half (since numbers decrease)
                    end = mid - 1;
                } else {
                    // Target lies in right half
                    start = mid + 1;
                }
            }
        }

        // If target not found, return -1
        return -1;
    }

    // Driver function to test the code
    public static void main(String[] args) {

        // Example 1: Ascending array
        int[] ascendingArray = {1, 3, 5, 7, 9, 11};
        int target1 = 7;
        int result1 = orderAgnosticBinarySearch(ascendingArray, target1);
        System.out.println("Index of " + target1 + " in ascending array: " + result1);

        // Example 2: Descending array
        int[] descendingArray = {20, 17, 15, 13, 10, 5, 1};
        int target2 = 10;
        int result2 = orderAgnosticBinarySearch(descendingArray, target2);
        System.out.println("Index of " + target2 + " in descending array: " + result2);
    }
}
