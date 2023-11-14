package Array;

public class RotateArrayByNIndexOptimal {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		RotateArrayByNIndexOptimal rotate = new RotateArrayByNIndexOptimal();
		rotate.rotate(arr, 6);
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public void rotate(int arr[], int n) {
		n = n % arr.length;
		swap(arr, 0, n - 1);
		swap(arr, n, arr.length - 1);
		swap(arr, 0, arr.length - 1);
	}

	public void swap(int arr[], int initial, int index) {
		int size = (index - initial);
		if (size < 1)
			return;
		int temp = arr[index];
		arr[index] = arr[initial];
		arr[initial] = temp;
		swap(arr, initial + 1, index - 1);

	}
}
