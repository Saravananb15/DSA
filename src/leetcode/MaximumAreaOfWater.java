package leetcode;

public class MaximumAreaOfWater {
	public static void main(String[] args) {
		int[] nums= {1,8,6,2,5,4,8,3,7};
		MaximumAreaOfWater mr = new MaximumAreaOfWater();
		System.out.println(mr.maximum(nums));
	}
	public int maximum(int[] height) {
		int left = 0;                  
        int right = height.length - 1;  
        int maxWater = 0;               
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int water = width * h;
            maxWater = Math.max(maxWater, water);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater; 
	}
}
