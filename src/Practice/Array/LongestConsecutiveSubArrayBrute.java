package Practice.Array;

public class LongestConsecutiveSubArrayBrute {
	public static void main(String[] args) {
		int arr[] = {100,4,200,1,3,2};
		int res = longestConsecutive(arr);
		System.out.println(res);
	}
	public static int longestConsecutive(int[] nums) {
		if(nums.length == 1) return 1;
        int longest = 1;
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            int count =1 ;
            while(linearSearch(nums,element+1)) {
            	element+=1;
            	count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
	
	public static boolean linearSearch (int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
}
