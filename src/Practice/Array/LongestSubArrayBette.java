package Practice.Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayBette {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
		LongestSubArrayBette longest = new LongestSubArrayBette();
		longest.longestSubArray(arr, 3);
	}

	public void longestSubArray(int arr[], int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int sum = 0,maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum == k) {
				maxLen = Math.max(maxLen, i+1);
			}
			int rem = sum-k;
			if(map.containsKey(rem)) {
				int len = i-map.get(rem);
				maxLen = Math.max(maxLen, len);
			}
			if(!map.containsKey(rem)) {
				
				map.put(sum, i);
			}
		}
		
		for(Map.Entry<Integer, Integer> i : map.entrySet()) {
			System.out.print(i.getKey()+ " ");
			System.out.print(i.getValue());
			System.out.println("");
		}
	}
}
