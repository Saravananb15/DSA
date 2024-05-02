package binarySearch;

public class RowWithMaximumNumberOf1S {
	public static void main(String[] args) {
		int[][] arr = {{0,0,1,1,1},{0,0,0,0,1},{0,1,1,1,1}};
		System.out.println(maximum(arr));
	}
	public static int maximum (int[][] array) {
		int maximum = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			int low =0,high = array[0].length-1;
			int index= high;
			while(low<=high) {
				int mid = (low+high)/2;
				if(array[i][mid] == 1) {
					high = mid-1;
				}else {
					low=mid+1;
				}
			}
			if(high == index) {
				return -1;
			}
			index = index-low+1;
			maximum = Math.max(maximum, index);
		}
		
		return maximum;
	}
}
