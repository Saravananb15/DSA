package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBrute {

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
		Set<List<Integer>> set = new HashSet<>();
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(nums[i]+nums[j]+nums[k]==0) {
						List<Integer> list2 = Arrays.asList(nums[i],nums[j],nums[k]);
						list2.sort(null);
						set.add(list2);
					}
				}
			}
		}
		List<List<Integer>> list = new  ArrayList<>(set);
		return list;
	}
}
