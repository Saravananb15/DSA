package Practice.Array.Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleThreeBrute {
	public static void main(String[] args) {
		PascalTriangleThreeBrute pascal = new PascalTriangleThreeBrute();
//		List<List<Integer>> result = pascal.pascalTriangle(5);
		List<List<Integer>> result = pascal.pascalTriangleOptimal(5);
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j) + " ");
			}
			System.out.println();
		}
//		pascalTriangle(5);
	}

	public List<List<Integer>> pascalTriangle(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> temp = new ArrayList<>();
			for (int col = 1; col <= i; col++) {
				temp.add(Ncr(i - 1, col - 1));
			}
			result.add(temp);
		}
		return result;
	}

	public int Ncr(int row, int column) {
		int res = 1;
		for (int i = 0; i < column; i++) {
			res = res * (row - i);
			res = res / (i + 1);
		}
		return res;
	}

	// optimal
	public List<List<Integer>> pascalTriangleOptimal(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 1; i <= numRows; i++) {
			result.add(generateRow(i));
		}
		return result;
	}

	public List<Integer> generateRow(int row) {
		int ans = 1;
		List<Integer> temp = new ArrayList<>();
		temp.add(ans);
		for (int i = 1; i < row; i++) {
			ans = ans * (row - i);
			ans = ans / (i);
			temp.add(ans);
		}
		return temp;
	}
}
