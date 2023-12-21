package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBetter {

	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		ThreeSumBetter better = new ThreeSumBetter();
		List<List<Integer>> list = better.threeSum(nums);
		for(int i=0;i<list.size();i++) {
			for(int j : list.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> finalSet = new HashSet<>();
		for(int i=0;i<nums.length-1;i++) {
			Set<Integer> set = new HashSet<>();
			for(int j=i+1;j<nums.length;j++) {
				int num = -(nums[i]+nums[j]);
				if(set.contains(num)) {
					List<Integer> list2 = Arrays.asList(nums[i],nums[j],num);
					list2.sort(null);
					finalSet.add(list2);
				}
				set.add(nums[j]);
			}
		}
		
		List<List<Integer>> list = new  ArrayList<>(finalSet);
		return list;
	}
}
