package binarySearch;

import JP.Jp2MinimumOperation;

public class FindtheKthMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1 };
		FindtheKthMissingNumber kth = new FindtheKthMissingNumber();
//		System.out.println(kth.missing(arr, 5));
		System.out.println(kth.optimalMissing(arr, 1));
	}

	public int missing(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= k) {
				k++;
			} else {
				break;
			}
		}
		return k;
	}

	public int optimalMissing(int[] arr, int k) {
		if (arr.length == 1) {
			if (arr[0] <= k) {
				k++;
			}
			return k;
		}
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] - mid <= k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return low+k;
	}
}
