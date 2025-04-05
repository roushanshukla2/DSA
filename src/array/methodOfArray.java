package array;

import java.util.Arrays;

public class methodOfArray {
	
	public static void main(String[] args)
	{
		char str[] = new char[6];
		for(int i=0;i<str.length;i++)
		{
			str[i]=(char)(97+i);
		}
		for(char i:str)
		{
			System.out.println(i);
		}
		System.out.println(Arrays.asList(str));
		System.out.println(Arrays.binarySearch(str, 'a')+1);
		System.out.println(Arrays.binarySearch(str, 0, 3, 'u'));
	}

}
