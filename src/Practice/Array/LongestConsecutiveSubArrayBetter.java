package Practice.Array;

import java.util.Arrays;

public class LongestConsecutiveSubArrayBetter {
	public static void main(String[] args) {
		int arr[] = {1,2,0,1};
		int res = longest(arr);
		System.out.println(res);
	}
	public static int longest(int nums[]) {
		int size = nums.length;
		int count = 0;
		int maximum = 0;
		int lastSmaller = Integer.MIN_VALUE;
		if(nums.length == 0)return 0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]-1==lastSmaller) {
				count++;
				lastSmaller = nums[i];
			}else if(nums[i]!=lastSmaller) {
				count=1;
				lastSmaller=nums[i];
			}
			maximum = Math.max(maximum, count);
		}
		return maximum;
	}
}
