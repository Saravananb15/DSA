package Practice.Array;

import java.util.Arrays;

public class RearrangeBySign {
	public static void main(String[] args) {
		int arr[] = {3,1,-2,-5,2,-4};
		RearrangeBySign rearrange = new RearrangeBySign();
		int newArr[] = new int[10];
		newArr = Arrays.copyOf(arr, arr.length);
		for(int i : newArr) {
			System.out.println(i);
		}
//		int res[] = rearrange.rearrage(arr);
//		for(int i : res) {
//			System.out.println(i);
//		}
	}

	public int[] rearrage(int nums[]) {
		int arr[] = new int[nums.length];
		int positive = 0;
		int negative = 1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) {
				arr[positive]=nums[i];
				positive+=2;
			}else {
				arr[negative]=nums[i];
				negative+=2;
			}
		}
		return arr;
	}
}
