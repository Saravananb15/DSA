package Array;

public class SumOfDiagonals2DArray {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		int result = sumDiagonalElements(array);
		System.out.println("Sum Of Digonals : "+result);
	}
	
	
	public static int sumDiagonalElements(int[][] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				if (i == j) {
					sum += array[i][i];
//				}
//			}
		}
		return sum;
	}
}
