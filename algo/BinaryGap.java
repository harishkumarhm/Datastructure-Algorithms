package algo;

public class BinaryGap {
	/*
	 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Assume that:

N is an integer within the range [1..2,147,483,647].
Complexity:

expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).*/
	 
	
	    public int solution(int N) {
	        String binaryStr = Integer.toBinaryString(N);
	        char[] binaryArr = binaryStr.toCharArray();
	        int gap =0;
	        int ptr1 = 0;
	        int ptr2 = 0;
	        int maxgap = 0;
	       while(ptr2<binaryArr.length)
	       {
	           if(binaryArr[ptr1]=='1')
	           {   
	            ptr1++;
	            ptr2 = ptr2 +2;
	            gap=binaryArr[ptr1]=='0'?gap+1: gap;
	          
	                   if(ptr2<binaryArr.length)
	            gap=binaryArr[ptr2]=='0'?gap+1: gap;
	            
	                 if(gap>maxgap)
	                   maxgap =gap;
	                 
	             ptr1= ptr2;
	           }
	           else
	           {ptr1++;
	           ptr2= ptr2+2;
	           gap =0;
	           }
	     
	    }
	    return maxgap;
	    }
	    
	    public int getGap(int N)
	    {
	    	int r =0;
	    	int count = -1;
	    	int max =0;
	    	while(N>0)
	    	{
	    		r = N &1;
	    		System.out.println(N);
	    		N = N>>1;
	    		System.out.println(N);
	    		if(0==r && count>=0){
	    			count++;
	    		}
	    		if(1==r)
	    		{
	    			
	    			max = count>max?count:max;
	    			count=0;
	    		}
	    	}
	    	return max;
	    }
	    
	    public static void main(String[] args)
	    {
	    	BinaryGap gap = new BinaryGap();
	    	int max = gap.getGap(1041);
	    	//expected 5;
	    	System.out.println(max);
	    }
	}
