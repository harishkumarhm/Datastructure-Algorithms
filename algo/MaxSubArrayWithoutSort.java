package algo;

public class MaxSubArrayWithoutSort {
  
  
  public static void main(String[] args)
  {
	  int[] arr = { 4, 3, -5, 0, 6, -8, 12, 3, -9, 2, 5, 8, -3, 4, 8, 0, 3, -3, -5, -9, 4, 2 };
	  int maxSum =0;
	  int sum=0;
	  int startIndex = 0;
	  int endIndex =0;
	  int maxEndIndex =0;
	  while(endIndex < arr.length)
	  {
		  sum = sum+arr[endIndex];
		  if(sum > maxSum)
		  {
			  maxSum = sum;
			  maxEndIndex = endIndex;
		  }
		  else if(sum<=0)
		  {
			 
			  sum =0;
			  startIndex = endIndex +1;
		  }
		  endIndex++;
	  }
	  System.out.println("The maximum sub array index from " + startIndex + " to " + (maxEndIndex) + " And Maximum sum is: " + maxSum);
	  
	  
	  
  }
		    
}
