package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
	public static void main(String[] args) {
		int nums[] = {15};
		MaxFrequency mf = new MaxFrequency();
		System.out.println(mf.maxFreqency(nums));
	}

	public int maxFreqency(int nums[]) {
		if(nums.length==1)return 1;
		int n[] = new int[nums.length+1];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		int max = Integer.MIN_VALUE;
		int times = 0;
		for(int num : map.values()) {
			if(num == max) {
				times++;
			}else if(num > max) {
				max=num;
				times=1;
			}
		}
		return max*times;
	}
}
