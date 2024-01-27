package leetcode;

public class MinimumSortedDuplicates extends MinimunInSortedRotated{
	public static void main(String[] args) {
		int[] nums = {3,1,2,3,3,3,3,3,3,3,3,3};
		MinimumSortedDuplicates minsr = new MinimumSortedDuplicates();
		System.out.println(minsr.sortedRotated(nums));
	}
		
	@Override
	public int sortedRotated(int[] nums) {
		// TODO Auto-generated method stub
		int result =Integer.MAX_VALUE;
		int low=0,high=nums.length-1;
		while(low<=high) {
			int mid= (low+high)/2;
			if(nums[low]==nums[mid] && nums[mid]==nums[high]) {
				low++;
				high--;
				continue;
			}
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
