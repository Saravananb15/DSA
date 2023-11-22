package Practice.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumBrute {
	public static void main(String[] args) {
		int arr[] = {3,2,4};
		int target = 6;
		TwoSumBrute tsb = new  TwoSumBrute();
		int sol[] = tsb.twoSum(arr, target);
		for(int i : sol) {
			System.out.println(i);
		}
	}
	public int[] twoSum(int nums[],int target) {
		//brute 
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if((arr[i]+arr[j])==target) {
//					System.out.println("Yes");
//					System.out.println(i+" "+j);
//				}
//			}
//		}
		
		//better
//		Map<Integer, Integer> map = new  HashMap<>();
//		for(int i=0;i<nums.length;i++) {
//			int more = target-nums[i];
//			if(map.containsKey(more)) {
//				return new int[] {map.get(more),i};
//			}
//			map.put(nums[i], i);
//		}
//		return new int[] {-1,-1};
		
		//optimal
		Arrays.sort(nums);
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right) {
			int sum = nums[left]+nums[right];
			if(sum ==target) {
				return new int[] {left,right};
			}
			if(sum < target) left++;
			if(sum>target) right--;
			}
		return new int[] {-1,-1};
	}
}
