package Practice.Array;

public class RotateByImageBrute {
	public static void main(String[] args) {
		int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
		RotateByImageBrute rotate = new RotateByImageBrute();
		rotate.rotate(nums);
	}
	public void rotate(int matrix[][]) {
		int n= matrix.length;
		int m= matrix[0].length;
		int arr[][]= new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[j][n-1-i]= matrix[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
