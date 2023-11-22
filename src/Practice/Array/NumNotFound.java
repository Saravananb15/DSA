package Practice.Array;

public class NumNotFound {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6};
		int res = findMissingNumberInArray(arr);
		System.out.println(res);
	}

	static int findMissingNumberInArray(int[] arr) {
		// TODO
//		int numNotFound = 0;
//		for (int i = 1; i <= arr.length; i++) {
//			if (arr[i - 1] != i) {
//				numNotFound = i;
//			}
//		}
//		return numNotFound;
		
		int n = arr.length+1;
		int expectedSum = (n*(n+1)/2);
		int actual = 0;
		
		for(int num : arr) {
			actual += num;
		}
		return expectedSum-actual;
	}
}
