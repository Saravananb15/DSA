package Practice.Array;

public class SetMatrixToZeroBetter {
	public static void main(String[] args) {
//		int nums[][] = {{1,1,1},{1,0,1},{1,1,1}};
		int nums[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//		int nums[][] = {{-1},{2},{3}};
		SetMatrixToZeroBetter set = new SetMatrixToZeroBetter();
		set.setZero(nums);
//		for(int i=0;i<sol.length;i++) {
//			for(int j=0;j<sol[i].length;j++) {
//				System.out.print(sol[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
	public void setZero(int matrix[][]) {
		int row[] = new int[matrix.length];
		int column[] = new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==0) {
					row[i]=1;
					column[j]=1;
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			if(row[i]==1) {
				for(int j=0;j<matrix[0].length;j++) {
					matrix[i][j]=0;
				}
			}
		}
		for(int j=0;j<matrix[0].length;j++) {
			if(column[j]==1) {
				for(int i=0;i<matrix.length;i++) {
					matrix[i][j]=0;
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
