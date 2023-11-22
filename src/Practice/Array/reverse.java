package Practice.Array;

public class reverse {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3,4, 5 };
		int[] res = reverse(arr,3);
		for (int i : res) {
			System.out.println(i);
		}
	}

	public static int[] reverse(int[] nums, int k) {
		k %= nums.length;
		int n = nums.length;
		reverseNum(nums, 0, n - 1);
		reverseNum(nums, 0, k - 1);
		reverseNum(nums, k, n - 1);
		return nums;
	}

	public static void reverseNum(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
