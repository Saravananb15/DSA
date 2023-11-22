package Practice.Array;

public class LongestSubArrayWithK {
	public static void main(String[] args) {
		int arr[] = { 1,2,3,1,1,1,1,4,2,3};
		LongestSubArrayWithK longest = new LongestSubArrayWithK();
		longest.longestSubArray(arr, 3);
	}

	public void longestSubArray(int arr[], int k) {
		int longest = 0;
		for (int i = 0; i < arr.length; i++) {
			int s = 0;
			for (int j = i; j < arr.length; j++) {
				s+=arr[j];
//				for (int m = i; m < j; m++) {
//					s += arr[k];
//				}
				if (s == k) {
					longest = Math.max(longest, j-i+1);
				}
			}

		}
		System.out.println(longest);
	}
}
