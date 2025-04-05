package searching;

import java.util.Arrays;

/**
 * This class provides a method to perform Binary Search on a sorted array.
 *
 * Time Complexity:
 *   - Best Case: O(1)         → when the key is at the middle
 *   - Average/Worst Case: O(log n)
 *
 * Space Complexity:
 *   - O(1) → constant space
 */
public class BinarySearch {

    /**
     * Performs binary search to find the index of the key in the given array.
     * The array is sorted before performing the binary search.
     *
     * arr The input array to search in
     * key The value to find
     * @return Index of the key if found; otherwise, -1
     */
    public int binarySearch(int[] arr, int key) {
        int size = arr.length;

        if (size < 1)
            return -1; // Empty array

        // Binary Search requires the array to be sorted
        Arrays.sort(arr);

        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If key is found at mid
            if (arr[mid] == key)
                return mid;

            // If key is smaller, search left half
            else if (arr[mid] > key)
                end = mid - 1;

            // If key is greater, search right half
            else
                start = mid + 1;
        }

        return -1; // Key not found
    }
}
