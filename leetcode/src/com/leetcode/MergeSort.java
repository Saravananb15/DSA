package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int n = 3;
		int[] nums2 = {2,5,6};
		MergeSort ms = new MergeSort();
		ms.merge(nums1, m, nums2, n);
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			list1.add(nums1[i]);
		}
		for(int j=0;j<n;j++) {
			list1.add(nums2[j]);
		}
//		Collections.sort(list1);
		System.out.println(Arrays.toString(list1.toArray()));
    }
}
