package binarySearch;

public class FirstAndLastPosition {
	public static void main(String[] args) {
		int[] nums = {2,2};
		FirstAndLastPosition fr = new FirstAndLastPosition();
		int[] ans = fr.firstAndLast(nums, 2);
		for(int i : ans) {
			System.out.println(i);
		}
	}
	
	public int[] firstAndLast(int[] nums,int target) {
		int[] ans = {-1,-1};
		if(nums.length == 1) {
			if(nums[0]==target) {
				ans[0]= nums[0];
				ans[1]=nums[0];
				return ans;
			}else {
				return ans;
			}
		}
		int low=0,high =nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]==target) {
				if(nums[mid-1]==target) {
					ans[0]=mid-1;
					ans[1]=mid;
				}
				if(nums[mid+1]==target) {
					ans[0]=mid;
					ans[1]=mid+1;
				}
				return ans;
			}
			if(nums[mid]>target) {
				high=mid-1;
			}
			if(nums[mid]<target) {
				low=mid+1;
			}
		}
		return ans;
	}
}
