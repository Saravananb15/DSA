package Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		SelectionSort sr = new SelectionSort();
		int arr[] = { 13, 46, 24, 52, 20, 9 };
		int[] res = sr.selectionSorting(arr);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	public int[] selectionSorting(int arr[]) {
		for (int i = 0; i <= arr.length - 2; i++) {
			int min = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
		return arr;
	}

	public static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}
}
