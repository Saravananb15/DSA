package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> out = threeSum(nums);
		for (int i = 0; i < out.size(); i++) {
			for (int j = 0; j < out.size(); j++) {
				System.out.println(out.get(i).get(j));
			}
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
	
		List<List<Integer>> ans = new ArrayList<>();
		int n = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < n; i++) {
			if (i != 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];

				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
					ans.add(temp);
					j++;
					k--;
					while (k > j && nums[k] == nums[k + 1])
						k--;
					while (k > j && nums[j] == nums[j - 1])
						j++;
				}
			}
		}
		return ans;
	}
}
