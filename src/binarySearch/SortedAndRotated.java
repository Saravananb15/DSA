package binarySearch;

public class SortedAndRotated {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		SortedAndRotated sr = new SortedAndRotated();
		int res =sr.sortedAndRotated(arr, 0);
		System.out.println(res);
	}
	public int sortedAndRotated(int[] nums,int target) {
		int index =-1 ;
		int left=0;
		int right=nums.length-1;
		
		while(left<=right) {
			while(nums[left]>target && left< nums.length) {
				left++;
			}
			int mid= (right+left)/2;
			if(nums[mid]<target ) {
				left=mid+1;
			}else {
				right=mid-1;
			}
			if(nums[left]==target) {
				return left;
			}else if(nums[right]==target) {
				return right;
			}else {
				return index;
			}
		}
		return index;
	}
}
