package algo;

public class BinarySearch {
	static int a[] = {1, 3, 5, 8, 12, 17, 19, 34, 56, 65, 76, 89, 99};
    static int data = 110;
	public static void main(String[] args) {
		int indx = search(0, a.length-1);
		System.out.println(indx);
	}
	public static int search(int low, int high) {
		if(low> high)
			return -1;
		 int  mid = (low+ high)/2;
	      if(data == a[mid])
	    	  return mid;
	      else{ if(data > a[mid]) 
	    	   return search(mid+1, high);
	        if(data < a[mid])
	           return search(low , mid-1);
	      }
	       
	        return -1;
	}
}
