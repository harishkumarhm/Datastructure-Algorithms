package algo;

public class SearchInSortedMatrix {
	public static void main(String[] args)
	{
		int[][] searchMatrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				
		};
		int found = contain(searchMatrix,13);
		System.out.println("The searched number " + found +" is found");
	}
	
	public static int contain(int[][] matrix, int var)
	{
		int row =  0;
		int col =  matrix[0].length-1;
		while(col>-1 && row< matrix.length)
		{
			if(var==matrix[row][col])
				return matrix[row][col];
			else if(var<matrix[row][col])
				col--;
			else
				row++;
		}
		return 0;
	}

}
