package Practice.Array.Hard;

public class maximumProductBetter {
	public static void main(String[] args) {
		int arr[] = {-2,0,-1 };
		maximumProductBetter maxi = new maximumProductBetter();
		int res = maxi.maxProduct(arr);
		System.out.println(res);
	}

	public int maxProduct(int[] nums) {
		int maximum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = i; j < nums.length; j++) {
				product = product * nums[j];
				maximum = Math.max(maximum, product);
			}
			maximum = Math.max(maximum, product);
		}
		return maximum;
	}
}
