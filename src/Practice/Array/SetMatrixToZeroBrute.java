package Practice.Array;

public class SetMatrixToZeroBrute {
	public static void main(String[] args) {
//		int nums[][] = {{1,1,1},{1,0,1},{1,1,1}};
		int nums[][] = {{-1},{2},{3}};
		SetMatrixToZeroBrute set = new SetMatrixToZeroBrute();
		int sol[][] = set.setZero(nums);
		for(int i=0;i<sol.length;i++) {
			for(int j=0;j<sol[i].length;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int[][] setZero(int matrix[][]) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==0) {
					markRow(matrix, i);
					markColumn(matrix, j);
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]== Integer.MIN_VALUE) {
					matrix[i][j]=0;
				}
			}
		}
		return matrix;
	}
	
	public void markRow(int[][] nums, int i) {
		for(int j=0;j<nums[i].length;j++) {
			if(nums[i][j]!= 0) {
				nums[i][j]= Integer.MIN_VALUE;
			}
		}
	}
	public void markColumn(int[][] nums,int j) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i][j]!=0) {
				nums[i][j]= Integer.MIN_VALUE;
			}
		}
	}
}
