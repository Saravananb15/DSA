package Practice.Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithKBetter {
	// this solution is better when no negative values
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,-1,1,1,1,1,4,-1,0,0,0,4,5};
		int k =3 ;
		LongestSubArrayWithKBetter longest = new LongestSubArrayWithKBetter();
		longest.longestBetter(arr, k);
	}
	
	public void longestBetter(int[] arr, int k) {
		Map<Integer, Integer> preSum = new HashMap<>();
		int sum = 0;
		int len = 0;
		int maxLen = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			int rem = sum-k;
			if(preSum.containsKey(rem)) {
				len = i-preSum.get(rem);
			}else {
				preSum.put(sum, i);
			}
			maxLen = Math.max(maxLen, len);
		}
		System.out.println(maxLen);
	}

}
