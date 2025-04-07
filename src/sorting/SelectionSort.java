package sorting;

public class SelectionSort {
	public int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			if(minIndex!=i)
			{
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}
}
/*
Selection sort is a comparison based algorithm.It sorts an array by 
repeatedly selecting the smallest (or largest) element from the unsorted
portion and swapping it with the first unsorted element. 
This process continues until the entire array is sorted.

steps:
first we find the smallest element from the array and place it at the index 0
then we check for the smallest element from the remaining element and place it
at the second 1 index and so on.


Time Complexity: O(n^2)
Space Complexity: O(1) because it takes only extra memory for temporary variables.

*/