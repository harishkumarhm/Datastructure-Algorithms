package algo;

public class SlidingWindow {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		int wSize = 3;
	    int max = Integer.MIN_VALUE;
	    int secMax = Integer.MIN_VALUE;
	    for(int i=0; i<wSize; i++)
	    {
	    	if(arr[i] > max)
	    	{
	    		max = arr[i];
	    		
	    	}
	    	else
	    	{
	    		if(arr[i]> secMax)
	    			secMax = arr[i];
	    	}
	    }
		
		
	}

}
