package Practice.Array;

public class LongestSubArrayWithSumKOptimal {
	public static void main(String[] args) {
		int arr[] = {2,3,5};
		int k = 5;
		LongestSubArrayWithSumKOptimal longest = new LongestSubArrayWithSumKOptimal();
		longest.LongestSubArray(arr, k);
	}
	public void LongestSubArray(int arr[],int k) {
		int left=0,right=0;
		int maxLen = 0;
		long sum = arr[left];
		
		while(right < arr.length) {
			while(left <= right  && sum >k ) {
				sum -= arr[left];
				left++;
			}
			
			if(sum == k ) maxLen = Math.max(maxLen, right-left+1);
			right++;
			if(right < arr.length) sum+= arr[right];
		}
		System.out.println(maxLen);
	}
}
