package algo;

import java.util.Arrays;

public class RotatedArray {
  public static void main(String[] args)
  {
	  //int arr[] = {7,8,9,1,2,3,4,5,6};
	  int arr[] ={3,4,5,6,7,8,9,10,11};
	 // rotateClockWise(arr,4);
	 // rotateAntiClockWise(arr,4);
	 // System.out.println(Arrays.toString(arr));
	//  rotateClockBetter(arr,4);
	  rotateAntiClockWise(arr,4);
	  System.out.println("Rotated Array: "+ Arrays.toString(arr));
	  System.out.println("Minimum element in the array is:" + findMinimumSortedRotated(arr));
	  System.out.println("The element 3 is found at the position "+ search(arr,0, arr.length-1,3));
  }
  //Rotate clock wise..
  public static void rotateClockWise(int[] arr, int k)
  {
	  for(int i = 0; i<k ; i++)
	  {
		  
		  for(int j=arr.length-1; j>0; j--)
		  {
			int temp = arr[j];
			arr[j]= arr[j-1];
			arr[j-1] = temp;
		  } 
		  
	  }
  }
  //Rotate anti clock wise...
  public static void rotateAntiClockWise(int[] arr, int k)
  {
	  for(int i=0; i< k; i++)
	  {
		  for(int j=0; j<arr.length-1; j++)
		  {
			  int temp = arr[j+1];
			  arr[j+1] = arr[j];
			  arr[j] = temp;
			
		  }
	  }
  }
  
  // Rotate Clock wise
  
  public static void rotateClockBetter(int[] arr, int k)
  {
	  int[] arr2 = arr.clone() ;
	  int l = arr.length;
	  for(int i=0; i < arr.length; i++)	
	  {
		  arr2[i] = arr[(l-k+i)%l];
	  }
  System.out.println(Arrays.toString(arr2));
  }
  
  //Rotate anti clock wise
  public static void rotateAntiClockBetter(int[] arr, int k)
  {
	  int[] arr2 = arr.clone();
	  for(int i =0; i< arr.length; i++)
	  {
		  arr2[i] = arr[(i+k)%arr.length];
	  }
	  System.out.println(Arrays.toString(arr2));
  }
  
  public static int findMinimumSortedRotated(int[] arr)
  {
	  if(arr[0] <= arr[arr.length-1]||arr.length == 1)
		  return arr[0];
	  if(arr.length==0)
		  return -1;
	  else
		 return findMinimum(arr,0, arr.length);
	   
  }
  
  public static int findMinimum(int[] arr,int low, int high)
  {
	  int mid = (low+high)/2;
	  if(arr[mid-1] > arr[mid])
		  return arr[mid];
	  if(arr[mid+1]< arr[mid])
		  return arr[mid+1];
	  if(arr[mid] < arr[high])
		  return findMinimum(arr, 0, mid);
	  else
		  return findMinimum(arr,mid, high);
  }
  
  public static int search(int[] arr, int low, int high, int k)
  {
	  int mid = low + (high - low) / 2;
	  if(arr[mid]==k)
		  return mid;
	  if(arr[low] <= arr[high])
	  {
		  if(k>= arr[low] && k<=arr[mid] )
			  return search (arr, low, mid, k);
		  return search(arr, mid+1, high, k);
	  }
	  if(k>=arr[mid] && k<=arr[high])
		  return search(arr, mid+1, high, k);
	  return search(arr, low, mid, k);
  }
	  
}
