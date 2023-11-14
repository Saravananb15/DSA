package Array;

public class RotateArrayByNIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		RotateArrayByNIndex rotate = new RotateArrayByNIndex();
		rotate.rotate(arr, 3);
		for (int a : arr) {
			System.out.println(a);
		}
	}
	
	public void rotate(int arr[],int n) {
		int d = arr.length;
		n = n%d;
		int temp[] = new int[n];
		for(int i=0;i<n;i++) {
			temp[i]=arr[i];
		}
		for(int i=n;i<d;i++) {
			arr[i-n] = arr[i];
		}
		for(int i=d-n;i<d;i++) {
			arr[i]= temp[i-(d-n)];
		}
		
	}
}
