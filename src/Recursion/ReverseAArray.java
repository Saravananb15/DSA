package Recursion;

public class ReverseAArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		ReverseAArray rev = new ReverseAArray();
		int[] res =rev.reverse(arr, arr.length);
		for(int i : res) {
			System.out.println(i);
		}
	}

	int initial = 0;

	public int[] reverse(int arr[], int size) {
		if (initial >= size / 2) {
			return null;
		}

		swap(initial,size,arr);
		initial++;
		reverse(arr, size );
		return arr;
	}

	public void swap(int i, int j,int[] arr) {
		int temp = arr[i];
		arr[i]=arr[j-i-1];
		arr[j-i-1]=temp;
	}
}
