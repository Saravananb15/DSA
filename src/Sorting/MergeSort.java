package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {3,1,2,4,1,5,2,6,4};
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr,0,arr.length-1);
		for(int i: arr) {
			System.out.println(i);
		}
	}
	
	public void mergeSort(int[] arr, int low ,int high) {
		if(low>=high) return;
		
		int mid = (low + high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, high, mid);
	}
	
	public void merge(int[] arr, int low,int high,int mid) {
		List<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left <= mid && right<= high) {
			if(arr[left]<=arr[right]) {
				list.add(arr[left]);
				left++;
			}else {
				list.add(arr[right]);
				right++;
			}
		}
		
		while(left<= mid) {
			list.add(arr[left]);
			left++;
		}
		while(right<=high) {
			list.add(arr[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++) {
			arr[i]= list.get(i-low);
		}
	}
}
