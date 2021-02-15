package algo;

import java.util.Arrays;

public class SortBinaryArray {
	public static void main(String[] args)
	{
		int[] arr = {0,1,0,0,1,1,0,1,1,1,0,0,0};
		int[] result  = new int[arr.length];
		int start =0;
		int end  = arr.length-1;
		while(end>=start)
		{
			if(arr[end]==0 && arr[start]==1)
			{
				
					swap(arr, start, end);
					start++; end--;
				
					
			}else if(arr[start]==1)
				end--;
			else if(arr[end]==0)
				start++;
			else
			{
				start++; end++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int[] arr, int start, int end)
	{
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
	}
}
