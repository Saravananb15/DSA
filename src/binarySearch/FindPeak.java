package binarySearch;

public class FindPeak {
	public static void main(String[] args) {
		int[] nums = {1,5,1,2,1};
		FindPeak fp = new  FindPeak();
		System.out.println(fp.peak(nums));
	}

	public int peak(int[] nums) {
		int n = nums.length;
		if(nums[0]>nums[1])return 0;
		if(nums[n-1]>nums[n-2])return n-1;
		int low =1,high = n-2;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) {
				return mid;
			}
			if(nums[mid]>nums[mid-1]) {
				low=mid+1;
			}else if(nums[mid]<nums[mid-1]) {
				high = mid-1;
			}
		}
		
		return -1;
	}
}
