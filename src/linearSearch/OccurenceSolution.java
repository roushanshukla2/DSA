package linearSearch;

import java.util.Arrays;
import java.util.Random;

public class OccurenceSolution {
	
	
	public static void runTests() {
        Random rand = new Random();
        OccurenceSolution obj = new OccurenceSolution();
        
        int testCases = 500;
        int arraySize = 20; // Reduced size for better visibility
        int keyRange = 10; // Keys will be in range 0-10

        System.out.println("Running " + testCases + " test cases for each method...");

        long startTime = System.currentTimeMillis();

        for (int t = 1; t <= testCases; t++) {
            int[] arr = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                arr[i] = rand.nextInt(keyRange); // Fill array with random numbers
            }

            int key = rand.nextInt(keyRange); // Random key to search for
            int nth = rand.nextInt(5) + 1;  // Random occurrence to find (1 to 5)

            // Run all three functions
            int first = obj.firstOccurence(arr, key);
            int last = obj.lastOccurence(arr, key);
            int nthOccurrence = obj.nThOccurence(arr, key, nth);

            // Print test case details
            System.out.println("\nTest Case " + t + ":");
            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Key: " + key + ", Nth occurrence to find: " + nth);
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            System.out.println("Nth Occurrence: " + nthOccurrence);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nAll tests executed successfully!");
        System.out.println("Total Execution Time: " + (endTime - startTime) + " ms");
    }
	
	public int firstOccurence(int[] input,int key)
	{
		int resultIndex=-1;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]==key)
			{
				return i;
			}
		}
		return resultIndex;
		
	}
	
	public int lastOccurence(int[] input,int key) {
		int resultIndex=-1;
	for(int i=input.length-1;i>=0;i--)
	{
		if(input[i]==key)
			return i;
	}
	return resultIndex;
}
	
	
	
	public int nThOccurence(int[] input,int key,int atLocation) {
		int resultIndex=-1;
		int counter=1;
		for(int i=0 ;i<input.length;i++)
		{
			if(input[i]==key)
			{
				if(counter==atLocation)
					return i;
				else
					counter++;
			}
		}
		return resultIndex;
	}
	

}
