package leetcode;

import java.util.Arrays;

public class MedianOfSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		MedianOfSortedArray median = new MedianOfSortedArray();
		double res = median.median(nums1, nums2);
		System.out.println(res);
	}
	public double median(int[] nums1,int[] nums2) {
		int result[] = new int[nums1.length+nums2.length];
		if(result.length==0)return 0.0f;
		for(int i=0;i<nums1.length;i++) {
			result[i]=nums1[i];
		}
		for(int i=0;i<nums2.length;i++) {
			result[nums1.length+i]=nums2[i];
		}
		Arrays.sort(result);
		int mid = result.length/2;
		if(result.length%2 != 0) {
			return (double)result[mid];
		}
		return (double)((result[mid]+result[mid-1])/2);
	}
	public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
		int ans[] = new int[2];
		int left=0,right=length-1;
		while(left<length-1) {
			int sum = numbers[left]+numbers[right];
			if(sum == target) {
				ans[0]=left;
				ans[1]=right;
				return ans;
			}else {
				--right;
			}
            if(right==left){
                right = length-1;
                ++left;
            }
		}
		
		return ans;
    }
}
