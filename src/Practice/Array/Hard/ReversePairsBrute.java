package Practice.Array.Hard;

public class ReversePairsBrute {
	public static void main(String[] args) {
		int arr[] = {-5,-5};
		ReversePairsBrute rp = new ReversePairsBrute();
		int res = rp.reversePairs(arr);
		System.out.println(res);
	}

	public int reversePairs(int[] nums) {
		int pairs = 0;
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				if((long)nums[i]>(long)2*nums[j]) {
					pairs+=1;
				}
			}
		}
		return pairs;
	}
}
