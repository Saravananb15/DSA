package Practice.Array;

public class MissingNumber {
	
	public static int missingNumber(int[] nums, int N) {
		if(nums.length == 1) return 0;
		int xor1 = 0, xor2 = 0;

		for (int i = 0; i < N ; i++) {
			xor2 = xor2 ^ nums[i]; 
			xor1 = xor1 ^ (i + 1); 
		}
		int res = 0;
		if((xor1 ^ xor2) == 0) {
			res = nums[N-1]+1;
		}else {
			res = xor1 ^ xor2;
		}

		return res; 
	}

	public static void main(String args[]) {
		int a[] = {1};

		int ans = missingNumber(a, a.length);
		System.out.println("The missing number is: " + ans);
	}
}
