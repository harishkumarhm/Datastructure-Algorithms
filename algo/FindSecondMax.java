package algo;

public class FindSecondMax {
	public static void main(String[] args) {
		int[] nums = {1, 57, 34, 5, 12, 6, 8, 3, 56, 7, 64, 9};
		int fstMax = 0;
		int secMax = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > fstMax) {
				secMax = fstMax;
				fstMax = nums[i];
				
			}
			else if(nums[i]>secMax)
			{
				secMax =nums[i];
			}

		}
		System.out.println("First Max: " + fstMax + " Second Max: "+secMax);
	}
}
