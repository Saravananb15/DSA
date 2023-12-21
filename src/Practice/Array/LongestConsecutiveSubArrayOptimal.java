package Practice.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubArrayOptimal {
	public static void main(String[] args) {
		int nums[] = {1,2,1,0};
		LongestConsecutiveSubArrayOptimal longest = new LongestConsecutiveSubArrayOptimal();
		int res = longest.longest(nums);
		System.out.println(res);
	}
	public int longest(int nums[]) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		int longest = 1;
		for(int it : set) {
			if(!set.contains(it-1)) {
				int count =1;
				int x = it;
				while(set.contains(x+1)) {
					x =x +1;
					count++;
				}
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}
}
