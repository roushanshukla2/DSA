package searching;

/**
 * This class provides a method to perform Linear Search on an array.
 * 
 * Time Complexity:
 *   - Best Case: O(1)       → when the key is at the first index
 *   - Worst Case: O(n)      → when the key is at the end or not present
 * 
 * Space Complexity:
 *   - O(1) → constant extra space is used
 */
public class LinearSearch {

    /**
     * Performs a linear search to find the index of the key 'k' in the given array.
     *
     * The array to search in
     * k The key to find
     * @return The index of the key if found; otherwise, -1
     */
    public int linearSearch(int[] arr, int k) {
        int size = arr.length; // Get the length of the array
        if(size<1)
        	return -1;

        // Traverse the array from start to end
        for (int i = 0; i < size; i++) {
            // If the current element matches the key, return its index
            if (arr[i] == k)
                return i;
        }

        // If the key is not found, return -1
        return -1;
    }

}
