package Practice.Array;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithSumKOptimal2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int k = 3;
		CountSubArrayWithSumKOptimal2 longest = new CountSubArrayWithSumKOptimal2();
		int res = longest.LongestSubArray(arr, k);
		System.out.println(res);
	}

	public int LongestSubArray(int nums[], int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int count = 0;
		map.put(0, 1);
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			int remove = sum-k;
			count += map.getOrDefault(remove, 0);
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		
		return count;

//		int n = arr.length; // size of the given array.
//		Map<Integer,Integer> mpp = new HashMap();
//		int preSum = 0, cnt = 0;
//
//		mpp.put(0, 1); // Setting 0 in the map.
//		for (int i = 0; i < n; i++) {
//			// add current element to prefix Sum:
//			preSum += arr[i];
//
//			// Calculate x-k:
//			int remove = preSum - k;
//
//			// Add the number of subarrays to be removed:
//			cnt += mpp.getOrDefault(remove, 0);
//
//			// Update the count of prefix sum
//			// in the map.
//			mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
//		}
//		return cnt;
	}
}
