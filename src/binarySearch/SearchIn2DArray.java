package binarySearch;

public class SearchIn2DArray {
	public static void main(String[] args) {
			int nums[][] = {{1,2,3,4},{7,8,9,10},{13,14,15,16},{20,21,22,23}};
			System.out.println(search(nums, 23));
			System.out.println(searchOptimized(nums, 23));
			System.out.println(searchOptimizedForIncreasing(nums, 21));
	}
	
	public static boolean search(int matrix[][],int target) {
		for(int i=0;i<matrix.length;i++) {
			int low = 0,high = matrix[0].length-1;
			if(matrix[i][high] < target) {
				continue;
			}
			while(low<=high) {
				int mid = (low+high)/2;
				if(matrix[i][mid] == target) {
					return true;
				}else if(matrix[i][mid]  > target) {
					high = mid-1;
				}else {
					low=mid+1;
				}
			}
		}
		
		
		return false;
	}
	
	public static boolean searchOptimized(int[][] matrix,int target) {
		int low=0,high = matrix.length*matrix[0].length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			int row = mid/matrix[0].length;
			int column = mid%matrix[0].length;
			if(matrix[row][column] == target) {
				return true;
			}else if(matrix[row][column] > target){
				high = mid-1;
			}else {
				low =mid+1;
			}
		}
		return false;
	}
	
	public static boolean searchOptimizedForIncreasing(int[][] matrix , int target) {
		int row = 0, column = matrix[0].length-1;
		while(row<matrix.length && column >=0 ) {
			if(matrix[row][column] == target) {
				return true;
			}else if(matrix[row][column]<target) {
				row++;
			}else {
				column--;
			}
		}
		
		return false;
	}
}
