package Practice.Array;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int target = 18;
		int[] res = twoSum(arr, target);
		for(int result : res) {
			System.out.println(result);
		}
		
	}

	public static int[] twoSum(int[] nums, int target) {
		// TODO
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No element is equal to target");
	}
}
