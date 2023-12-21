package Practice.Array.Hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithK {

	public static void main(String[] args) {
		int nums[] = {4,2,2,6,4};
		int target = 6;
		LongestSubArrayWithK lon = new  LongestSubArrayWithK();
		int res = lon.longest(nums, target);
		System.out.println(res);
	
	}
	public int longest(int[] nums,int target) {
//		int count = 0;
//		for(int i=0;i<nums.length;i++) {
//			int xor =0;
//			for(int j=i;j<nums.length;j++) {
//				xor = xor^nums[j];
////				for(int k=i;k<=j;k++) {
////					xor ^= nums[k];
////				} removing 3rd loop for better solution
//				if(xor == target) {
//					count++;
//				}
//			}
//		}
//		return count;
		
		int n = nums.length; //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ nums[i];

            //By formula: x = xr^k:
            int x = xr ^ target;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
	}
}
