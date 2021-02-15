package recursion;

import java.util.Arrays;

public class printPossibleBrackets {

    public static void printPossibleCombination(char[] combination, int n, int pos, int close, int open)
    {
        if(close==n)
        {
            for(int i=0; i<2*n; i++)
                System.out.print(combination[i]);
            System.out.println();
        }
        else
        {
            if(open > close)
            {
                combination[pos] = '}';
                System.out.println("position for close position: "+ pos + " open: "+ open + " close: " + close + " array: "+ Arrays.toString(combination));

                printPossibleCombination(combination,n, pos+1,close+1, open);

            }
            if(open<n)
            {
                combination[pos] = '{';
                System.out.println("position for open position: "+ pos + " open: "+ open + " close: " + close + " array: "+ Arrays.toString(combination));

                printPossibleCombination(combination, n, pos+1,close, open+1);

            }
        }
    }

// {  }+{  }+{  }  +(pc after close(2,1,1)+pc after open (3,1,2))     +pc(4,2,2)+pc(5,2,3) ----+(pc(6,3,3)--> prints)
//{}+pc
    public static void main(String[] args)
    {
        int n=3;
        char[] combination = new char[2*n];
        printPossibleCombination(combination, n,0,0,0);

    }
}
