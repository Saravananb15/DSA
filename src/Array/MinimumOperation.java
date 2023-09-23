package Array;

public class MinimumOperation {
	public static void main(String[] args) {
		int[] arr = {5,2,3,1,1};
		int target = 5;
		int res = minOperations(arr, target);
		System.out.println(res);
	}
	public static int minOperations(int[] nums, int x) {
        int sum = 0;
        int count = 0;
        for(int i=nums.length-1;i>=0;i--){
        	if (sum == x){
                return count;
            }
            if(nums[i]<= x) {
            	sum += nums[i];
                count++;
            }
        }
        if (sum == x){
            return count;
        }
        return -1;
    }
}
