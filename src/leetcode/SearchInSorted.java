package leetcode;

public class SearchInSorted {
	public boolean search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target)
				return true;
			if (nums[mid] > target) {
				if (nums[low] <= nums[mid] && nums[mid] > target) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (nums[mid] <= nums[high] && nums[high] > target) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return false;
	}
}
