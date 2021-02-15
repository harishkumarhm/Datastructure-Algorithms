package algo;

import java.util.StringTokenizer;

public class ReverseWordsInSentance {
	public static void main(String[] args)
	{
	String test = "Mera Bharath Mahan";
	 StringTokenizer st = new StringTokenizer(test," ");
	while( st.hasMoreTokens())
	{
		System.out.print(new StringBuilder(st.nextToken()).reverse()+" ");
	}
	}
}
