package algo;

import java.util.Scanner;

public class MatrixDiagonalDiff {
  public static void main(String[] args)
  {
	  
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  int[][] intMtrix = new int[n][n];
	  while(true)
	  {
		  for(int i=0; i<n; i++)
		  {
			  for(int j=0; j<n; j++)
			  {
				  intMtrix[i][j] = scanner.nextInt();
			  }
		  }
		  break;
	  }
// Printing the input Matrix.	  
//	  for(int i=0; i<n; i++)
//	  {
//		  for(int j=0; j<n; j++)
//		  {
//			 System.out.println(intMtrix[i][j]);
//		  }
//	  }
	  
//Summing diagonal 1;
	  long sumd1 = 0;
	  for( int row =0, col=0 ; row < n && col <n; row++, col++)
		  sumd1 = sumd1 +intMtrix[row][col];
	  System.out.println("Diagonal 1 sum: " + sumd1);
	  long sumd2 =0;
	  for(int row =0, col = n-1; row<n && col>=0; row++, col--)
		  sumd2 = sumd2 + intMtrix[row][col];
	  System.out.println("Diagonal 2 sum: "+ sumd2);
	  System.out.println("Diagonal difference of the matrix is: "+ (long)(sumd2-sumd1));
		  
  }
}
