package dynamicprogramming;

public class LongestIncreasingSubsequence {

    public static void main(String[] args)
    {
        int[] seq = { 10, 22, 9, 33, 21, 50, 41, 60 };
       int length = longestSubSequence(seq, seq.length);
        System.out.println(length);
    }

    public static int longestSubSequence(int[] sequence, int n)
    {
        int max =0;
        if(n==0)
            return 0;
        int[] lisc = new int[n];

        for(int i=0; i<n; i++)
            lisc[i] = 1;
        for(int i=1; i< n; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(sequence[i] > sequence[j] && lisc[j]+1 >lisc[i])
                    lisc[i] = lisc[j]+1;
            }
        }

        for(int i=0; i<n; i++)
        {
            max = lisc[i] > max ?lisc[i]: max;
        }
        return max;
    }
}
