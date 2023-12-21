package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumOptimal {

	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		List<List<Integer>> list = threeSum(nums);
		for(int i=0;i<list.size();i++) {
			for(int j : list.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new  ArrayList<>();
		int length = nums.length;
		Arrays.sort(nums);
		for(int i=0;i<length;i++) {
			if(i>0 && nums[i] == nums[i-1])continue;
			int j = i+1;
			int k = length-1;
			while(j<k) {
				int sum = nums[i]+nums[j]+nums[k];
				if(sum<0) {
					j++;
				}else if(sum >0) {
					k--;
				}else {
					List<Integer> list2 = Arrays.asList(nums[i],nums[j],nums[k]);
					list.add(list2);
					j++;
					k--;
					while(j<k && nums[j]==nums[j-1])j++;
					while(j<k && nums[k]==nums[k+1])k--;
				}
			}
		}
		return list;
	}
}
