package algo;

import java.util.Arrays;

public class IntegerProductList {

	public static void main(String[] args)
	{
		int[] arr = {2, 3, 6, 7, 4, 5,9};
		int[] result = new int[arr.length];
	    int productSoFar = 1;
		for(int i =0; i<arr.length; i++)
		{
			
			result[i] =  productSoFar;
			productSoFar = productSoFar * arr[i];
		}
		
		productSoFar = 1;
		int j;
		for(j = arr.length-1; j>= 0; j--)
		{
		  result[j]	= result[j]*productSoFar;
		  productSoFar = productSoFar * arr[j];
		}
	//	result[j] = productSoFar;
		System.out.println("Product Array: "+ Arrays.toString(result));
	}


}
