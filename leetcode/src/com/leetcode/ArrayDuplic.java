package com.leetcode;

public class ArrayDuplic {
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,3,4,5};
		int n = 0;
		int dupli = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[n]==arr[i]) {
				System.out.println(arr[n]);
				n++;
				dupli++;
			}
			if(i == arr.length) {
				i = n+2;
				n++;
			}
		}
		System.out.println(dupli);
	}
}
