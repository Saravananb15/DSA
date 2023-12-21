package Practice.Array;

public class SetMatrixToZeroOptimal {
	public static void main(String[] args) {
//		int nums[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//		int nums[][] = {{1,0}};
//		int nums[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		int nums[][] = {{1},{0},{3}};
		SetMatrixToZeroOptimal set = new SetMatrixToZeroOptimal();
		set.setMatrix(nums);
	}

	public void setMatrix(int matrix[][]) {
		int index = 1;
		int n = matrix.length;
		int m = matrix[0].length;
		if(n == 1 || m == 1 ) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(matrix[i][j]==0) {
						index =0;
					}
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					if (j != 0) {
						matrix[0][j] = 0;
					} else {
						index = 0;
					}
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] != 0) {
					if (matrix[i][0] == 0 || matrix[0][j] == 0) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		if (matrix[0][0] == 0) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
		if (index == 0) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
