package algo;

public class MinimumInRotatedArray {

	public static void main(String[] args) {
		int[] arr = {7,8,9,1,2,3,4,5,6};
		findMinimum(arr);
		searchElement(arr, 6);

	}
	public static void searchElement(int[] arr, int element) {
		if (arr.length == 1)
			System.out.println("Element found at index : " + 0);
		else {
			int index = search(arr, 0, arr.length-1, element);
			System.out.println("Element found at index : " + index);
		}
	}

	public static void findMinimum(int[] arr) {

		if (arr[0] < arr[arr.length - 1])
			System.out.println("Minimum : " + arr[0]);
		if (arr.length == 1)
			System.out.println("Minimum : " + arr[0]);
		else {
			int min = findMin(arr, 0, arr.length - 1);
			System.out.println("Minimum : " + min);
		}
	}
	public static int findMin(int[] arr, int low, int high) {

		int mid = low + (high - low) / 2;
		if (arr[mid + 1] < arr[mid])
			return arr[mid + 1];
		if (arr[mid] < arr[mid - 1])
			return arr[mid];
		if (arr[mid] < arr[high])
			return findMin(arr, low, mid);

		return findMin(arr, mid, high);

	}

	public static int search(int[] arr, int low, int high, int k)
	{
		int mid = low+(high-low)/2;
		if(k==arr[mid])
			return mid;
		if(arr[low] <=arr[mid])
		{
			if(k<=arr[mid])
				return search(arr, low, mid, k);
			return search(arr, mid+1, high,k);
		}
		if(k>=arr[mid]&& k<=arr[high])
			return search(arr, mid+1, high, k);
			
		return search(arr, low, mid, k);
		
	}
	
//	public static int search(int[] arr, int low, int high, int element) {
//
//		int mid = low + (high - low) / 2;
//
//		if (arr[mid] == element)
//			return mid;
//
//		if(arr[low] <= arr[mid])
//		{
//			if(element>=arr[low] && element<= arr[mid])
//				return search(arr,low, mid, element);
//			return search(arr, mid+1, high, element);
//		}
//
//		if (element >= arr[mid] && element <= arr[high])
//			return search(arr, mid+1, high, element);
//		return search(arr, low, mid, element);
//		// return 0;
//	}
}
