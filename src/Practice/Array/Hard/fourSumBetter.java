package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fourSumBetter {
	public static void main(String[] args) {
		int nums[] = {-5,5,4,-3,0,0,4,-2};
		fourSumBetter sum = new fourSumBetter();
		List<List<Integer>> list = sum.fourSum(nums,4);
		for(int i=0;i<list.size();i++) {
			for(int j : list.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public List<List<Integer>> fourSum(int[] nums, int target){
		int length = nums.length;
		Set<List<Integer>> setList = new HashSet<>(); 
		for(int i=0;i<length-2;i++) {
			for(int j=i+1;j<length-1;j++) {
				Set<Long> set = new HashSet<>();
				for(int k=j+1;k<length;k++) {
					long sum = nums[i]+nums[j]+nums[k];
					long fourth = target-sum; 
					if(set.contains(fourth)) {
						List<Integer> sumList = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
						sumList.sort(null);
						setList.add(sumList);
					}
					set.add((long)nums[k]);
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(setList);
		return ans;
	}
}
