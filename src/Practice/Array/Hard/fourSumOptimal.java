package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fourSumOptimal {
	public static void main(String[] args) {
		int nums[] = {2,2,2,2,2};
		fourSumOptimal sum = new fourSumOptimal();
		List<List<Integer>> list = sum.fourSum(nums,8);
		for(int i=0;i<list.size();i++) {
			for(int j : list.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public List<List<Integer>> fourSum(int[] nums, int target){
		int length = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		for(int i=0;i<length-2;i++) {
			for(int j=i+1;j<length-1;j++) {
				if(j !=(i+1) && nums[j]==nums[j-1] )continue;
				int k = j+1;
				int l = length-1;
				while(k<l) {
					long sum = nums[i];
					sum += nums[j];
					sum += nums[k];
					sum += nums[l];
					if(sum == target) {
						List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
						ans.add(list);
						k++;l--;
						while( k<l && nums[k]==nums[k-1])k++;
						while(k<l && nums[l]==nums[l+1])l--;
					}else if(sum < target){
						k++;
					}else {
						l--;
					}
				}
			}
		}
		return ans;
	}
}
