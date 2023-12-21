package Practice.Array;

public class RotateByImageBetter {
	public static void main(String[] args) {
		int nums[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		RotateByImageBetter rotate = new RotateByImageBetter();
		rotate.rotate(nums);
	}

	public void rotate(int matrix[][]) {
		int n = matrix.length;
		int m = matrix[0].length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < m; j++) {
				if (i == j) {
					continue;
				}
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < matrix.length/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
