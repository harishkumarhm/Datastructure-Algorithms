
package algo;

public class FindMaxMinInArr {
	public static int[] testArr = {9,34,6,4,53,2,9,1,60};
	public static void main(String[] arg)
	{ 
		//normalApproach();
		//betterApproach();
		MinMax minMax = bestApproach(0, testArr.length-1);
		System.out.println("Max: " +minMax.max);
		System.out.println("Min: " +minMax.min);
	}
 public static void normalApproach()
 {
	 int min = testArr[0];
		int max = testArr[0];
		for(int i=0; i<testArr.length; i++)
		{
			if(testArr[i]< min)
				min = testArr[i];
			if(testArr[i]>max)
				max = testArr[i];
		}
		System.out.println("Minimum " + min);
		System.out.println("Maximum " + max);
 }
public static void betterApproach()
{
	int min = testArr[0];
	int max = testArr[0];
    for(int i=0; i<testArr.length/2; i++)
    {
    	int num1 = testArr[i*2];
    	int num2 = testArr[i*2+1];
    	if(num1< num2)
    	{
    		if(num1<min)
    			min=num1;
    		 if(num2>max)
    			max=num2;
    	}
    	else
    	{
    		if(num2<min)
    			min=num2;
    		 if(num1>max)
    			max=num1;
    	}
    	
    }
    
	System.out.println("Minimum "+ min);
	System.out.println("Maximum "+ max);
}

public static MinMax bestApproach(int i, int j)
{
	if(i>j)
		return null;
	if(i==j)
		return new FindMaxMinInArr().new MinMax(testArr[i],testArr[j]);
	MinMax left = bestApproach(i,(i+j)/2);
	MinMax right = bestApproach((i+j)/2+1,j);
	if(left==null)
		return right;
	if(right==null)
		return left;
	else
		return new FindMaxMinInArr().new MinMax(Math.min(left.min, right.min), Math.max(left.max, right.max));

}

public class MinMax
{
	int min;
	int max;
	public MinMax(int min, int max)
	{
		this.min = min;
		this.max = max;
	}
}
  
}
