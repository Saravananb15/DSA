package Array;

public class rotate {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		int[] res = rotateArray(arr, 2);
		
	}
	public static int[] rotateArray(int[] arr,int times) {
		int index = arr.length;
		for(int i=times;i>0;i--) {
			for(int j=0;j<arr.length;j++) {
				int temp = 0;
				temp = arr[index];
				arr[index]= arr[index-1];
				arr[index-1]=temp;
			}
		}
		return arr;
	}
}
