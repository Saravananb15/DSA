package binarySearch;

public class SearchInsertFunction {
	public static void main(String[] args) {
		int nums[] = { -1, 0, 3, 5, 9, 12 };
		int target = 2;
		SearchInsertFunction bs = new SearchInsertFunction();
		int res = bs.binarySearch(nums, target);
		System.out.println(res);
	}

	public int binarySearch(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target)
				return mid;
			if (nums[mid] > target)
				high = mid - 1;
			if (nums[mid] < target)
				low = mid + 1;
		}
		return low;
	}
}
