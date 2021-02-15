package dynamicprogramming;

public class CoinProblem {
    private static int[] denominations ={1,2,5};
    private static int amount = 7;
    public static void main(String[] args)
    {
        int[] solutions = new int[amount+1];
        solutions[0] = 1;
       for(int denomination : denominations)
        {
            for(int i= denomination; i<amount+1; i++)
            {
                solutions[i] = solutions[i-denomination] + solutions[i];
            }
        }


        System.out.println(solutions[amount]);
    }
}
//[0,1,2,3,4,5,6,7]
//[0,0,0,0,0,0,0,0]
//[1,1,
