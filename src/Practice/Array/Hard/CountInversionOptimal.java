package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class CountInversionOptimal {
	public static void main(String[] args) {
		int[] arr = {5,3,2,4,1};
		CountInversionOptimal inv = new  CountInversionOptimal();
		int res  =inv.inversion(arr);
		System.out.println(res);
	}
	public int inversion(int arr[]) {
		int count= usingMergeSort(arr, 0, arr.length-1);
		return count;
	}
	public int usingMergeSort(int[] arr,int low,int high) {
		int count = 0;
		if (low>= high)return count;
		int mid = (low+high)/2;
		count+= usingMergeSort(arr, low, mid);
		count+= usingMergeSort(arr, mid+1, high);
		count+= merge(arr, low, mid, high);
		return count;
	}
	public int merge(int[] arr,int low,int mid,int high) {
		List<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid+1;
		int count = 0;
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				list.add(arr[left]);
				left++;
			}else {
				list.add(arr[right]);
				count += (mid-left+1);
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
		return count;
	}
}
