package binarySearch;

public class PeakElement2 {
	public static void main(String[] args) {
		int[][] nums = {{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};
		int[] sol = findPeakGridOptimized(nums);
		for(int i : sol) {
			System.out.println(i);
		}
	}

	public int[] findPeakGrid(int[][] mat) {
		int row = -1;
		int column = -1;
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]>largest) {
					largest = Math.max(largest, mat[i][j]);
					row = i;
					column =j;
				}
			}
		}
		return new int[]{row,column};
	}
	
	
	public static int[] findPeakGridOptimized(int[][] G) {
		int n= G.length;
		int m= G[0].length;
		int low =0,high=n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			int largest =0;int index= 0;
			for(int i=0;i<n;i++) {
				if(G[i][mid]>largest) {
					largest = Math.max(largest, G[mid][i]);
					index = i;
				}
			}
			int left = (mid-1>=0)?G[index][mid-1]:-1;
			int right = (mid+1< G[0].length)?G[index][mid+1]:-1;
			if(G[index][mid]> left && G[index][mid]>right) {
				return new int[] {index,mid};
			}else if (G[index][mid] < left){
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		
		return new int[]{-1,-1};
	}
	
}
