package Practice.Array.Hard;

public class PascalTriangleTwo {
	public static void main(String[] args) {
		PascalTriangleTwo pascal = new PascalTriangleTwo();
		pascal.pascalTriangle(5);
	}
	//brute
//	public void pascalTriangle(int numRows) {
//			for (int col = 1; col <= numRows; col++) {
//				System.out.println(Ncr(numRows-1, col-1));
//			}
//			System.out.println();
//		}
	
	
	//optimal
	public void pascalTriangle(int numRows) {
		int ans = 1;
		System.out.print(ans+" ");
		for (int col = 1; col < numRows; col++) {
//			ans = Ncr(numRows-1, col-1);
			ans = ans*(numRows-col);
			ans = ans/(col);
			System.out.print(ans+" ");
		}
	}

	public int Ncr(int row, int column) {
		int res = 1;
		for (int i = 0; i < column; i++) {
			res = res * (row - i);
			res = res / (i + 1);
		}
		return res;
	}
}
