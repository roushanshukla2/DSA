package array;
import java.util.Arrays;

public class binarySearch {
	
    public static int binarySearchElement(int[] arr, int key) {
        Arrays.sort(arr); // Sorting the array before searching

        int lower = 0, upper = arr.length - 1;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2; // Mid must be updated inside the loop

            if (arr[mid] == key) {
                return mid; // Key found, return index
            } else if (arr[mid] < key) {
                lower = mid + 1; // Move to right half
            } else {
                upper = mid - 1; // Move to left half
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1}; // Input array

        int key = 43; // Element to search for
        int result = binarySearchElement(arr, key); // Perform binary search

        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }

        
        
//        built in method
        
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,2));
        
        System.out.println(Arrays.toString(arr));
    }
}
