package com.OnlineTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Oracle {
	public static void main(String[] args) {
		int[] nums = {100,98,4,-1,99,4,1,5,2,5,3,0,101,102,103,104};
		System.out.println(consecutive(nums ));
		System.out.println(optimizedConsecutive(nums));
	}
	
	public static int consecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		
		
		int consecutive = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int index = nums[i];
			int count = 1;
			while(true) {
				if(map.containsKey(index-1)) {
					count+= map.get(index-1);
					break;
				}
				
				if(set.contains(index-1)) {
					count++;
					index--;
				}else {
					break;
				}
			}
			map.put(nums[i], count);
			consecutive = Math.max(consecutive, count);
			count =1;
		}
		return consecutive;
	}
	
	public static int optimizedConsecutive(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int consecutive =0;
		for(int i=0;i<nums.length;i++) {
			int index = nums[i];
			int count = 1;
			while(true) {
				if(map.containsKey(index-1)) {
					count+= map.get(index-1);
					break;
				}
				else {
					count++;
				}
			}
			map.put(nums[i], count);
			consecutive = Math.max(consecutive, count);
			count =1;
		}
		return consecutive;
	}
}
