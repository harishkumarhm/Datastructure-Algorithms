package algo;

import java.util.Scanner;

public class StairCase {
	public static void main(String[] args)
	{
 Scanner scanner = new Scanner(System.in);
 int n = scanner.nextInt();
 int stair =0;
 for(int j=0; j<n; j++)
 {   int k =0, m=0;
	while(k<n-(j+1))
	{
	 System.out.print(" ");
	 k++;
	}
	while(m<j+1)
	{
		 System.out.print("#");
		 m++;
	 }
	 System.out.print("\n");
 }
	}
}
