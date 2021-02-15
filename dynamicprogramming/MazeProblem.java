package dynamicprogramming;


/*
Given a maze with obstacles, count number of paths to reach rightmost-bottommost cell from topmost-leftmost cell. A cell in given maze has value -1 if it is a blockage or dead end, else 0.

From a given cell, we are allowed to move to cells (i+1, j) and (i, j+1) only.

Examples:

Input: maze[R][C] =  {{0,  0, 0, 0},
                      {0, -1, 0, 0},
                      {-1, 0, 0, 0},
                      {0,  0, 0, 0}};
Output: 4
There are four possible paths as shown in
below diagram.
blockage

 */
public class MazeProblem {

public static int countPath(int[][] maze)
{
    int R = maze.length;
    int C = maze[0].length;

    if(maze[0][0]==-1)
        return 0;
    for(int i=0; i< R; i++)
    {
        if(maze[i][0]==0)
           maze[i][0]=1;
        else
            break;
    }

    for(int j=0; j<C; j++)
    {
        if(maze[0][j]==0)
            maze[0][j]= 1;
        else
            break;
    }
    for(int i =1; i < R; i++)
    {
        for(int j=1; j< C; j++)
        {
            if(maze[i][j] == -1)
                continue;
            if(maze[i][j-1] == 1)
                maze[i][j] = maze[i][j] + maze[i][j-1];

            if(maze[i-1][j] == 1)
                maze[i][j] = maze[i][j] + maze[i-1][j];
        }

    }
    return maze[R-1][C-1]==-1?0: maze[R-1][C-1];
}
}
