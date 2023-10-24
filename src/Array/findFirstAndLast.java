package Array;

public class findFirstAndLast {
	public static void main(String[] args) {
		findFirstAndLast ffl = new findFirstAndLast();
		int[] arr = {2,2};
		int target = 2;
		int[] sol = ffl.searchRange(arr, target);
		for(int i : sol) {
			
			System.out.println(i);
		}
	}
	
	public int[] searchRange(int[] nums, int target) {
		if(nums.length==1 && nums[0]==target) {
			int sol[] = {0,0};
			return sol;
		}
		int start = 0;
		int end = nums.length-1;
		int[] arr = { -1, -1 };
		for (int i = 0; i < nums.length / 2; i++) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				if(mid != 0) {
					if(nums[mid-1]==target && mid != 0) {
						arr[0]=mid-1;
						arr[1]=mid;
					}
				}
				else {
					arr[0] = mid;
					arr[1] = mid+1;
				}
			}
			if(nums[mid]>target) {
				end = mid-1;
			}
			if(nums[mid]<target) {
				start = mid+1;
			}
		}
		return arr;
	}
}
