package leetcode;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		TwoSum two = new TwoSum();
		int ans[] =two.twoSum(nums, target);
		for(int i : ans) {
			System.out.println(i);
		}
	}
//	public int[] twoSum(int[] nums,int target) {
//		int ans[] = new int[2];
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0;i<nums.length;i++) {
//			int key = target-nums[i];
//			if(map.containsKey(key)) {
//				ans[0]=map.get(key);
//				ans[1]=i;
//				return ans;
//			}
//			map.put(nums[i], i);
//		}
//		
//		return ans;
//	}
	public int[] twoSum(int[] nums,int target) {
		int length = nums.length;
		int ans[] = new int[2];
		int left=0,right=length-1;
		while(left<length-1) {
			int sum = nums[left]+nums[right];
			if(sum == target) {
				ans[0]=left;
				ans[1]=right;
				return ans;
			}
			
		}
		
		return ans;
	}
}
