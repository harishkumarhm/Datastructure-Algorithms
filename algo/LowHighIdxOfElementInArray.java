package algo;

public class LowHighIdxOfElementInArray {

	static int[] arr = {1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8,
			9, 9, 9, 10};

	public static void main(String[] args) {
	int num = 2;
	 System.out.println("First occurrence of "+num +" is at "+ findFirst(arr, 0, arr.length-1, num));
     System.out.println("Last occurrence of "+num +" is at "+ findLast(arr ,0, arr.length-1, num));
	}

	public static int findLast(int[] arr, int low, int high, int k) {
		if(high>=low)
		{
         int mid = low+(high-low)/2;
         if(arr[mid]==k && mid==arr.length-1 || arr[mid] ==k && arr[mid+1] > arr[mid])
        	 return mid;
         if(k< arr[mid])
        	 return findLast(arr,low, mid-1, k);
         return findLast(arr, mid+1, high, k);
		}
		return -1;
	}
	
	public static int findFirst(int[] arr, int low, int high, int k)
	{
		if(high>=low)
		{
		int mid = low+(high-low)/2;
		if(mid==0 && k== arr[mid])
			return 0;
		if(arr[mid] == k  && arr[mid-1] < arr[mid])
			return mid;
		if(k<=arr[mid])
			return findFirst(arr, low, mid-1, k);
		return findFirst(arr, mid+1, high, k);
		}
		return -1;
	}
}