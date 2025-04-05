/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
		
		*/

package linearSearch;



public class FirstAndLast34 {

	public int[] retrunIndex(int[] nums , int target)
	{
		int[] result= {-1,-1};
		int index=0;
		for(int i=0;i<nums.length;i++)
		{
 
			if(nums[i]==target)
				result[index++]=i;
		}
		
		return result;
	}
}
