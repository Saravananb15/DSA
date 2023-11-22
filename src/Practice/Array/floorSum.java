package Practice.Array;

public class floorSum {
	public static void main(String[] args) {
		floorSum fs = new floorSum();
		int[] nums= {2,5,9};
		int res = fs.sumOfFlooredPairs(nums);
		System.out.println(res);
	}

	public int sumOfFlooredPairs(int[] nums) {
		int sum = 0;
		int m =1000000007;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				sum += (nums[i]*nums[j]);
			}
		}
		sum = sum%m;
		return sum;
	}

	
}
