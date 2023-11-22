package Practice.Array;

import java.util.Arrays;

public class FindMissingPositive {
	public static void main(String[] args) {
		int nums[] = {-1,-2};
//		int xor = 0;
//		int xor2 = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] > 0) {
//				xor = xor ^ nums[i];
//			}
//		}
//		for (int i = 1; i <= nums.length; i++) {
//			xor2 = xor2 ^ i;
//		}
//
//		System.out.println(xor ^ xor2);
		if(nums.length == 1) {
			if(nums[0]>1 || nums[0]<0) {
				System.out.println(1);
			}
		}
		Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>0 && nums[i+1]-nums[i] != 1 ){
            	if(nums[i]>1) {
            		System.out.println(1);
            	}
                System.out.println(nums[i]+1);
            }
        }
       System.out.println(nums[nums.length-1]+1);
    }
	}
