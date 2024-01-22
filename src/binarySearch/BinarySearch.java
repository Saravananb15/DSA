package binarySearch;

public class BinarySearch {
	public static void main(String[] args) {
		int nums[] = {-1,0,3,5,9,12};
		int target = 9;
		BinarySearch bs = new BinarySearch();
		int res = bs.binarySearch(nums, target);
		System.out.println(res);
	}
	public int binarySearch(int[] nums,int target) {
		int low=0,high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>target) high=mid-1;
            if(nums[mid]<target) low=mid+1;
        }
        return -1;
	}
}
