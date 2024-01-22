package leetcode;

public class HouseRobber {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		HouseRobber hr = new HouseRobber();
		System.out.println(hr.maxHouseMoney(nums));
	}
	public int maxHouseMoney(int[] nums) {
		int res=0;
		int oddRes =0;
		int eveRes = 0;
		for(int i=0;i<nums.length;i++) {
			if(i%2==0) {
				eveRes += nums[i];
			}else {
				oddRes +=nums[i];
			}
		}
		res = Math.max(oddRes, eveRes);
		return res;
	}
}
