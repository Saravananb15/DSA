package Practice.Array;

public class CheckIfArrayIsSortedAndRotated {
	public static void main(String[] args) {
		int nums[] = {3,4,5,1,2};
		CheckIfArrayIsSortedAndRotated check = new CheckIfArrayIsSortedAndRotated();
		check.check(nums);
	}

	public boolean check(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
