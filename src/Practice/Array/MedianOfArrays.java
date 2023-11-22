package Practice.Array;

import java.util.Arrays;

public class MedianOfArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3 };
		int[] arr2 = { 2 };
		double median = median(arr1, arr2);
		System.out.println(median);
	}

	public static double median(int[] nums1, int[] nums2) {
		int[] arr = new int[nums1.length+nums2.length];
        
		if(arr.length == 0) {
			return 0.0;
		}
		for(int i=0;i<nums1.length;i++) {
			arr[i]=nums1[i];
		}
		for(int i=0;i<nums2.length;i++) {
			arr[nums1.length+i]=nums2[i];
		}
		Arrays.sort(arr);
		if(arr.length % 2 !=0){
            int mid = arr.length / 2;
            return (double) arr[mid];
        }
		int mid = arr.length/2;
		return (double)(arr[mid-1]+arr[mid])/2;
	}
}
