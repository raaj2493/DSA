// Bubble Sort Algorithm in Java
// This program sorts an array using the bubble sort technique
// with a boolean flag to detect if the array is already sorted.

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2}; // Example input array

        bubbleSort(arr); // Calling the sorting function

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop: runs n-1 times
        for (int i = 0; i < n - 1; i++) {

            // Boolean flag to check if any swapping happened
            boolean swapped = false;

            // Inner loop: compares adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swapping logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Mark swapped as true since we performed a swap
                    swapped = true;
                }
            }

            // If no swaps occurred in this pass, the array is already sorted
            if (!swapped) {
                break; // Exit early for better efficiency
            }
        }
    }
}
