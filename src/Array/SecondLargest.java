package Array;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,7,6,4,3,5};
		int largest = arr[0];
		int secondLargest = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>secondLargest) {
				if(arr[i]>largest) {
					secondLargest = largest;
					largest = arr[i];
				}else {
					secondLargest=arr[i];
				}
			}
		}
		System.out.println(secondLargest);
	}
}
