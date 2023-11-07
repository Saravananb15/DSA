package Array;

public class LeftRotateByN {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = 3;
		LeftRotateByN left = new LeftRotateByN();
		left.leftRotate(arr, n);
		for(int val : arr) {
			System.out.println(val);
		}
	}
	
	public void leftRotate(int arr[],int n) {
		int length = n%arr.length;
		
		for(int i=0;i<length;i++) {
			int temp = arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1] = arr[j];
			}
			arr[arr.length-1]=temp;
		}
	}
}
