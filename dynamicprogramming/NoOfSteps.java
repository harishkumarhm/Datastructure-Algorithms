package dynamicprogramming;

public class NoOfSteps {

    public static int getNoOfWays(int n , int m)
    {

        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        for(int i=2; i<n+1; i++)
        {
            for(int j=1; j<=m && j<=i; j++)
            {
                result[i] += result[i-j];
            }
        }
        return result[n];
    }

    public static void main(String[] args)
    {
        System.out.println(getNoOfWays(4,2));
    }
}
