package Array;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> res = threeSum(nums);
		for(List<Integer> range : res) {
			for( int re : range) {
				System.out.println(re);
			}
		}
		
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> out = new ArrayList<>();
		int count = 1;
		int index = 0;
		while(count > 0) {
			for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		for(int k=j+1;k<nums.length;k++) {
        			if(nums[i]!=nums[j]&& nums[i]!=nums[k]&& nums[j]!=nums[k]) {
        				int sum = nums[i]+nums[j]+nums[k];
        				if(sum==0) {
        					out.get(index).set(i, nums[i]);
        					out.get(index).set(j, nums[j]);
        					out.get(index).set(k, nums[k]);
        					index++;
        					count++;
        				}else {
        					count--;
        				}
        			}
        		}
        	}
        }
		}
		return out;
    }
}
