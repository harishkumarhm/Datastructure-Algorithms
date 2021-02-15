package algo;

public class SpiralMatrix {

    public void printMatrix(int[][] matrix, int i, int j, int m, int n)
    {
        if(i>=m || j>=n)
            return;
        //print the first row.
        for(int p =j; p< n; p++)
            System.out.println(matrix[i][p]);
       // print the last column
        for(int p=i+1; p<m; p++)
            System.out.println(matrix[p][n-1]);

        // print the last row reverse
        for( int p=n-2; p>=j; p--)
            System.out.println(matrix[m-1][p]);

        // print the first column if it is not equal to the lat column
        if(j!=n-1)
        {
            for(int p=m-2;p>i; p--)
                System.out.println(matrix[p][j]);
        }
        printMatrix(matrix, i+1, j+1, m-1, n-1);
    }

    public static void main(String[] args)
    {
        int[][] a = {
                     {3,5,6,3,2,3},
                     {1,9,23,12,9,0},
                     {4,11,1,29,43,13},
                     {9,10,34,8,1,0}
                   };
        SpiralMatrix matrix = new SpiralMatrix();
        matrix.printMatrix(a, 0,0,4,6);
    }
}
