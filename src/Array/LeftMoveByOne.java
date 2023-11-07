package Array;

public class LeftMoveByOne {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
			int temp = arr[0];
			for(int j=1;j<arr.length;j++) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		
		
		for(int val : arr) {
			
			System.out.println(val);
		}
	}
}
