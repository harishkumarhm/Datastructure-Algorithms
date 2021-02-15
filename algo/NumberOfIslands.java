package algo;

public class NumberOfIslands {

    public static void main(String[] args)
    {
        char[][] grid = {
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,1},
                {0,0,0,1,1}
        };

        System.out.println("no of Islands.. : "+ findNumberOfGrid(grid));
    }

    public static int findNumberOfGrid(char[][] grid)
    {
        int count =0;
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                    merge(grid,i, j);
                }
            }
        }
        return count;
    }

    public static void merge(char[][] grid, int i , int j)
    {
        if(i<0||i>=grid.length || j<0||j>=grid[0].length || grid[i][j]!=1)
            return;
        grid[i][j] = 'X';
        merge(grid,i,j+1);
        merge(grid,i,j-1);
        merge(grid,i+1, j);
        merge(grid,i-1, j);

    }
}
