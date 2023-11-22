package Practice.Array;

public class MaximumSubArraySum {
	public static void main(String[] args) {
		int arr[] = {-2,-1};
		MaximumSubArraySum max = new MaximumSubArraySum();
		int res = max.maxSum(arr);
		System.out.println(res);
	}
	public int maxSum(int nums[]) {
		if(nums.length == 1) return nums[0];
        int sum=0,max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			max = Math.max(max, sum);
			if(sum < 0) sum =0;
		}
		return  max;
	}
}
