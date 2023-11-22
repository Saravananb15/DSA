package Practice.Array;

import java.util.ArrayList;
import java.util.List;

public class LeaderInAnArray {
	public static void main(String[] args) {
		int arr[] = {10,22,12,3,0,6};
		LeaderInAnArray leader = new LeaderInAnArray();
		leader.leader(arr);
	}
	
	public void leader(int nums[]) {
		int max = Integer.MIN_VALUE;
		List<Integer> list = new ArrayList<>();
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]>max) {
				max = nums[i];
				list.add(nums[i]);
			}
		}
		for(int i : list) {
			System.out.println(i);
		}
	}
}
