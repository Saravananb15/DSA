package Practice.Array;

public class SquareOfSorted {
	public static void main(String[] args) {
		int nums[] = {-4,-1,0,3,10};
		SquareOfSorted sort = new SquareOfSorted();
		int res[] = sort.square(nums);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
	
	public int[] square(int[] nums) {
		int n = nums.length;
		int left = 0;
		int right = n-1;
		int index = n-1;
		int[] res = new int[n];
		while(left <= right) {
			if(nums[left] <0) {
				nums[left]*=-1;
			}else if(nums[right]<0) {
				nums[right]*=-1;
			}
			if(nums[left]> nums[right]) {
				res[index]= nums[left]*nums[left];
				left++;
			}else {
				res[index]=nums[right]*nums[right];
				right--;
			}
			index--;
		}
		return res;
	}
}
