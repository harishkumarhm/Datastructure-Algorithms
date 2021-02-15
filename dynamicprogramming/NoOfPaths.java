package dynamicprogramming;

public class NoOfPaths {

    public static int noOfPaths(int m, int n)
    {
        int[][] result  = new int[m][n];

        //First row
        for(int i=0; i<n; i++)
           result[0][i] = 1;
        for(int j=0; j<m; j++)
            result[j][0] = 1;

        for(int i=1; i<m; i++)
        {
            for(int j=1; j<n; j++)
            {
                result[i][j] = result[i][j-1] +result[i-1][j];//+result[i-1][j-1];
            }
        }

        return result[n-1][m-1];
    }
}
