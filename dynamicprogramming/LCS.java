package dynamicprogramming;
//Longest common subsequence
public class LCS {
    //sequence1 ="ABCGFH" , sequence2 = "GHFJAR"
    public static int longestCommonSequence(char[] sequence1, char[] sequence2, int m, int n)
    {
        int[][] lcs = new int[m+1][n+1];
        for(int i=0; i<=m; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 || j==0)
                    lcs[i][j] = 0;

                else if(sequence1[i-1] == sequence2[j-1])
                    lcs[i][j] = lcs[i-1][j-1]+1;
                else
                {
                    lcs[i][j]= Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }

        return lcs[m][n];
    }

    public static void main(String[] args)
    {
       String string1 ="AGGTAB" , string2 = "GXTXAYB";
       char[] sequence1 = string1.toCharArray();
       char[] sequence2 = string2.toCharArray();
       int m = string1.length();
       int n = string2.length();
       int lcs = longestCommonSequence(sequence1, sequence2, m,n);
        System.out.println(lcs);
    }
}
