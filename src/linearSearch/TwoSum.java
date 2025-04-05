/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

package linearSearch;

public class TwoSum {
	public int[] solutionTwoSum(int[] nums,int target)
	{
		int[] resultArray=new int[2];
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target ) {
					resultArray[0]=i;
					resultArray[1]=j;
					return resultArray;
				}
			}
		}
		
		
		return new int[] {};
	}
	
}
