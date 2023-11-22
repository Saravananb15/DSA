package Practice.Array;

public class RemoveDuplicatesFromSortedArrayLeetcode {
	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicatesFromSortedArrayLeetcode rem = new RemoveDuplicatesFromSortedArrayLeetcode();
		int res = rem.removeDuplicates(arr);
		System.out.println(res);
	}
	public int removeDuplicates(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        
        return xor;
    }
}
