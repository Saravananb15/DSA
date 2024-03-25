package leetcode;

public class MinimumNumberOfDays {
	public static void main(String[] args) {
		int[] nums = { 1,10,3,10,2 };
		MinimumNumberOfDays min = new MinimumNumberOfDays();
		int res = min.binarySearch(nums, 3, 1);
		System.out.println(res);
	}

	public int binarySearch(int[] bloomDay, int m, int k) {
		if(bloomDay.length <m*k)return -1;
		int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
		for (int i = 0; i < bloomDay.length; i++) {
			low = Math.min(bloomDay[i], low);
			high = Math.max(high, bloomDay[i]);
		}
		int numberofbouquet = 0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(possible(bloomDay, mid, m, k)) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return low;
	}
	public boolean possible(int[] bool,int day,int m,int k) {
		int count=0;
		int noofbouqet =0;
		for(int i=0;i<bool.length;i++) {
			if(bool[i]<=day) {
				count++;
			}else {
				noofbouqet += (count/k);
				count=0;
			}
		}
		noofbouqet += (count/k);
		return noofbouqet>=m;
	}
	
}
