package Practice.Array;

import java.util.Arrays;

public class Pairs {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5};
		int[][] res = pairs(arr);
		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res.length;j++) {
				System.out.print(res[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	
	public static int[][] pairs(int[] arr) {
		int[][] res = new int[arr.length][arr.length];
		int count = 10;
		for(int i=0;i<arr.length;i++) {
			count = arr[i]*10;
			for(int j=0;j<arr.length;j++) {
				res[i][j]= count+arr[j];
			}
		}
		return res;
	}
}
