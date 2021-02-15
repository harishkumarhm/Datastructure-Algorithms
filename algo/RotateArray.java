package algo;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
  public static void main(String[] args)
  {
	  Scanner scanner = new Scanner(System.in);
	  String[] inArgs = scanner.nextLine().split(" ");
	  int d = Integer.parseInt(inArgs[0]);
	  int n = Integer.parseInt(inArgs[1]);
	  int[] arr = new int[n];
	 
	   for(int i=0; i<n; i++)
	  {
		  arr[i] = scanner.nextInt();
	  }
	  int[] arr2 = arr.clone();
	  int[] arr3 = arr.clone();
	  int[] arr4 = arr.clone();
	  //left rotation (anti clock wise)
	  System.out.println("-----------------");
	  System.out.println("left rotation(anti-clock wise) o(n2)");
	  for(int m=0; m< d; m++)
	  {   
		  for(int p=0; p<arr.length-1; p++)
		  {
			  int temp = arr[p];
			  arr[p]= arr[(p+1)%n];
			  arr[(p+1)%n]= temp;
		  }
		  for(int j=0; j<arr.length; j++)
			  System.out.print(arr[j]+" ");
		  System.out.println("");
	  }
	  
	  
 //Right rotation (clock wise)
	  System.out.println("-------------------------");
	  System.out.println("Right rotation (clock wise) O(n2)");
	 for(int i=0; i<d; i++)
	 {
	  for(int p=n-1; p>0; p--)
	  {    
			  int temp = arr3[p];
			  arr3[p]=  arr3[p-1];
			  arr3[p-1]= temp;
			  
	  }
		 
  }
	 for(int j=0; j<arr3.length; j++)
		  System.out.print(arr3[j]+" ");
//	  for(int j=0; j<arr.length; j++)
//		  System.out.print(arr[j]+" ");
	  
	  /* To do with O(n) and space complexity O(n)
	   * 
	   */
	  System.out.println("-----------------------");
	  System.out.println("Right rotation (clock wise) With complexity O(n)");
	 int[] copy = arr2.clone();
	 int offset = arr2.length- d%n;
    for (int j=0; j<arr2.length; j++)
	  {
		  arr2[j] = copy[(offset+j)%n];
		  
	  }
    System.out.println(Arrays.toString(arr2));
    
    System.out.println("---------------------");
    System.out.println("left rotation (anti-clock wise) With complexity O(n)");
    int[] copy2 = arr4.clone();
    for(int i=0; i<arr4.length; i++)
    	arr4[i] = copy2[(d+i)%n];
    System.out.println(Arrays.toString(arr4));
    
  }
  
}
