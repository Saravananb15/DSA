package Practice.Array.Hard;

import java.util.Arrays;

public class MergeTwoSortedArrayBetter {
	public static void main(String[] args) {
		int arr1[] = {1,3,5,7};
		int arr2[] = {0,2,6,9};
		MergeTwoSortedArrayBetter merge = new MergeTwoSortedArrayBetter();
		merge.merge(arr1,arr1.length, arr2,arr2.length);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

	public void merge(int[] nums1,int m, int[] nums2,int n) {
		int left = m-1;
		int right = 0;
		while(nums1[left] >=0 && nums2[right]<n) {
			if(nums1[left]>nums2[right]) {
				swap(nums1,nums2,left,right);
				left--;
				right++;
			}else {
				break;
			}
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
	}
	
	public void swap(int[] arr1,int[] arr2,int n,int m) {
		int temp = arr1[n];
		arr1[n]=arr2[m];
		arr2[m]=temp;
	}
}
