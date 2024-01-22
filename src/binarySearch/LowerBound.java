package binarySearch;

public class LowerBound {
	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		LowerBound lb = new LowerBound();
		int ans[] = lb.searchRange(arr, 8);
		for(int i : ans) {
			System.out.println(i);
		}
	}
	public int[] searchRange(int[] nums, int target) {
	       int lb = lowerbound(nums, target);
	       if(lb == nums.length || nums[lb] != target)return new int[] {-1,-1};
	       return new int[] {lb,upperbound(nums, target)-1};
	    }
	public int lowerbound(int arr[],int target) {
		int size = arr.length;
		int left=0,right=size-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]>=target) {
				size = mid;
				right = mid-1;
			}else {
				left=mid+1;
			}
		}
		return size;
	}
	public int upperbound(int arr[],int target) {
		int size = arr.length;
		int left=0,right=size-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]>target) {
				size=mid;
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return size;
	}
}
