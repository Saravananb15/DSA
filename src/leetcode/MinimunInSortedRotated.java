package leetcode;

public class MinimunInSortedRotated {
	public static void main(String[] args) {
		int[] nums = {3,1,2,3,3,3,3,3,3,3,3,3};
		MinimunInSortedRotated min = new MinimunInSortedRotated();
		System.out.println(min.sortedRotated(nums) + " this method will return only correct ans if no duplicates present");
	}
	
	public int sortedRotated(int[] nums) {
		int result =Integer.MAX_VALUE;
		int low=0,high=nums.length-1;
		while(low<=high) {
			int mid= (low+high)/2;
			if(nums[low]<=nums[mid]) {
				result = Math.min(result, nums[low]);
				low=mid+1;
			}else {
				result = Math.min(result, nums[mid]);
				high=mid-1;
			}
		}
		return result;
	}
	
}
