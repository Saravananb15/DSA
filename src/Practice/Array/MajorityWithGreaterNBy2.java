package Practice.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityWithGreaterNBy2 {
	public static void main(String[] args) {
		int arr[] = {2,2,3,3,2,1,3,1,2,2,2,2};
		MajorityWithGreaterNBy2 majority = new MajorityWithGreaterNBy2();
		int ans = majority.majority(arr);
		System.out.println(ans);
	}

	public int majority(int nums[]) {
		int n = nums.length;
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0;i<nums.length;i++) {
//			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//		}
//		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
//            if (it.getValue() > (n / 2)) {
//                return it.getKey();
//            }
//        }
//
//        return -1;
		int count = 0,element=0;
		for(int i=0;i<nums.length;i++) {
			if(count == 0) {
				count++;
				element=nums[i];
			}else if(nums[i] == element) {
				count++;
			}else {
				count--;
			}
		}
		int result =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == element)result++;
		}
		if(result>(n/2))return element;
		return -1;
	}
}
