package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class ReversePairsOptimal {
	public static void main(String[] args) {
		int arr[] = { 2147483647,2147483647,2147483647,2147483647,2147483647,2147483647 };
		ReversePairsOptimal revOp = new ReversePairsOptimal();
		int res = revOp.reversePairs(arr);
		System.out.println(res);
	}

	public int reversePairs(int[] nums) {
		return mergeSort(nums, 0, nums.length-1);
	}

	public int reverse(int[] arr, int low, int mid, int high) {
		int count = 0;
		int right = mid + 1;
		for (int i = low; i <= mid; i++) {
			while (right <= high && arr[i] > (int)2 * arr[right])
				right++;
			count += (right - (mid + 1));
		}
		return count;
	}

	public int mergeSort(int[] arr, int low, int high) {
		int count = 0;
		if (low >= high)
			return count;
		int mid = (low + high) / 2;
		count += mergeSort(arr, low, mid);
		count += mergeSort(arr, mid + 1, high);
		count += reverse(arr, low, mid, high);
		merge(arr, low, mid, high);
		return count;
	}

	public void merge(int[] arr, int low, int mid, int high) {
		List<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			list.add(arr[left]);
			left++;
		}
		while (right <= high) {
			list.add(arr[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			arr[i] = list.get(i - low);
		}
	}
}
