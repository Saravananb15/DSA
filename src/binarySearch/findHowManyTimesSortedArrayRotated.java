package binarySearch;

public class findHowManyTimesSortedArrayRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,1,2,3};
		findHowManyTimesSortedArrayRotated fr = new findHowManyTimesSortedArrayRotated();
		System.out.println(fr.countRotated(nums));
	}
	
	public int countRotated(int[] nums) {
		int index = -1;
		int result = Integer.MAX_VALUE;
		int low=0,high=nums.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[low]<nums[mid]) {
				if(result>nums[low]) {
					index = low;
					result = nums[low];
				}
				low=mid+1;
			}else {
				if(nums[mid]<result) {
					result=nums[high];
					index=mid;
				}
				high=mid-1;
			}
		}
		return index;
	}
}
