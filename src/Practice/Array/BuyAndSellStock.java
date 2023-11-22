package Practice.Array;

public class BuyAndSellStock {
	public static void main(String[] args) {
		int nums[] = { 7,1,5,3,6,4};
		BuyAndSellStock bs = new BuyAndSellStock();
		int res = bs.buyAndSell(nums);
		System.out.println(res);
	}
	public int buyAndSell(int nums[]) {
		int profit=0;
		int min = nums[0];
		for(int i=1;i<nums.length;i++) {
			int cost = nums[i]-min;
			profit = Math.max(profit, cost);
			min = Math.min(min, nums[i]);
		}
		return profit;
	}
}
