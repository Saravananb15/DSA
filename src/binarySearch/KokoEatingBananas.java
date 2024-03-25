package binarySearch;

public class KokoEatingBananas {
	public static void main(String[] args) {
		int[] nums = {805306368,805306368,805306368};
		int hours = 1000000000;
		KokoEatingBananas koko = new KokoEatingBananas();
		System.out.println(koko.kokoEating(nums, hours));
	}
	public int kokoEating(int[] piles,int h) {
		int low=1,high=findMax(piles);
		while(low<=high) {
			int mid=(low+high)/2;
			long total = calculatehours(piles, mid);
			if(h>=total) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
	}
	
	public long calculatehours(int[] nums,int hours) {
		long total = 0;
		for(int i=0;i<nums.length;i++) {
			total += (int) Math.ceil((double)nums[i]/(double)hours);
		}
		return total;
	}
	public int findMax(int[] nums) {
		int max = 0;
		for(int n: nums) {
			max = Math.max(max, n);
		}
		return max;
	}
}
