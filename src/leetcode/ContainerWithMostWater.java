package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {
	
	public static void main(String[] args) {
		int[] nums = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(nums));
	}
	
	
	public static int maxArea(int[] height) {
        int maxi = Integer.MIN_VALUE;
        int left=0;int right= height.length-1;
        
        while(left<right) {
        	maxi = Math.max(maxi, (right-left)*Math.min(height[left],height[right]));
        	
        	if(height[left]<height[right]) {
        		left++;
        	}else {
        		right--;
        	}
        }
        return maxi;
    }
}
