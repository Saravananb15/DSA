package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,2,2,3,3,4,5,5,6,6};
		SingleElement se = new SingleElement();
		System.out.println(se.singleElement(nums));
		System.out.println(se.singleElementOptimal2(nums));
	}
	
	public int singleElement(int[] nums) {
		int element =0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		for(Map.Entry m : map.entrySet()){
			int temp = (int) m.getValue();
			if( temp==1) {
				element = (int) m.getKey();
			}
		}
		
		return element;
	}
	public int singleElementOptimal1(int[] nums) {
		int result =0;
		for(int i=0;i<nums.length;i++) {
			result ^= nums[i];
		}
		return result;
	}
	public int singleElementOptimal2(int[] nums) {
		int low = 1,high = nums.length-2;
		if(nums[0]!=nums[1])return nums[0];
		if(nums[nums.length-1]!=nums[nums.length-2])return nums[nums.length-1];
		while(low<=high) {
			int mid = (low+high)/2;
			if(nums[mid]!=nums[mid+1] && nums[mid-1]!=nums[mid])return nums[mid];
			if((mid%2==1 && nums[mid] == nums[mid-1])|| (mid%2==0)&& nums[mid]==nums[mid+1]) {
				low=mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
}
