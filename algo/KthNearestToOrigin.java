package algo;

import java.util.Arrays;

public class KthNearestToOrigin {
    public static int[][] points = { {3,3},{5,-1},{-2,4}};
    public static int getNearestPoint(int[][] points, int k)
    {
        int[] distances  = new int[points.length];
        for(int i=0; i<points.length; i++)
        {
             distances[i] = points[i][0]*points[i][0] + points[i][1]*points[i][1];
        }
        Arrays.sort(distances);
        int kMinDistance = distances[k-1];
        for(int j=0; j< points.length; j++)
        {
           int distance= points[j][0]*points[j][0] + points[j][1]*points[j][1];
           if(distance <= kMinDistance)
               return j;
        }
        return -1;
    }

    public static void main(String[] args)
    {
          int[][] points = { {3,3},{5,-1},{-2,4}};
        System.out.println(getNearestPoint(points, 2));

    }

}
