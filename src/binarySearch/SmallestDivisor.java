package binarySearch;

public class SmallestDivisor {
	public static void main(String[] args) {
		int[] nums= {1,2,5,9};
		SmallestDivisor sd = new SmallestDivisor();
		int res = sd.smallestDivisor(nums, 6);
		System.out.println(res);
	}
	public int smallestDivisor(int[] nums,int threshold) {
		int low =1,high=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			low = Math.min(low, nums[i]);
			high = Math.max(high, nums[i]);
		}
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(minimum(nums, mid)<=threshold) {
				high = mid-1;
			}else {
				low =mid+1;
			}
		}
		return low;
	}
	
	public int minimum(int[] nums,int curr) {
		int ceil = 0;
		for(int i=0;i<nums.length;i++) {
			ceil += Math.ceil((double)nums[i]/(double)curr);
		}
		return ceil;
	}
}
