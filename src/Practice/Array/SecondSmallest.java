package Practice.Array;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = {4,5,89,99,112210,21,23,100,54,6565,6567,1};
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=secondSmallest && arr[i]> smallest) {
				secondSmallest = arr[i];
			}
			if(arr[i]<smallest && arr[i]<secondSmallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
		}
		System.out.println(secondSmallest);
	}
}
