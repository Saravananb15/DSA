package Practice.Array;

public class LongestSubArrayCount {
	public static void main(String[] args) {
		int arr[] = {2,3,5,1,2,2,4,1,3,1 };
		int k = 5;
		LongestSubArrayCount longest = new LongestSubArrayCount();
		longest.longestBetter(arr,k);
	}

	public void longestBetter(int[] arr,int k) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum == k) {
				count++;
				sum=0;
			}
		}
		System.out.println(count);
	}
}
