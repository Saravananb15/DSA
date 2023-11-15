package Array;

public class findFirstAndLast {
	public static void main(String[] args) {
		findFirstAndLast ffl = new findFirstAndLast();
		int[] arr = { 1, 4 };
		int target = 4;
		int[] sol = ffl.searchRange(arr, target);
		for (int i : sol) {

			System.out.println(i);
		}
	}

	public int[] searchRange(int[] nums, int target) {
		if (nums.length == 1 && nums[0] == target)
			return new int[] { 0, 0 };
		int start = 0;
		int end = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if(start == end && target == nums[start]) return new int[] {start,start};
			int mid = start + (end - start) / 2;
			if (target > nums[mid]) {
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				if (nums[mid] == target) {
					if (mid > 0 && nums[mid - 1] == target) {
						return new int[] { mid - 1, mid };
					} else if (nums[mid + 1] == target) {
						return new int[] { mid, mid + 1 };
					}else {
						return new int[] {mid,mid};
					}
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
