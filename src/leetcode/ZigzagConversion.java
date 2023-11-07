package leetcode;

public class ZigzagConversion {
	public static void main(String[] args) {
		String str = "PaypalIsHiring";
		ZigzagConversion zig = new ZigzagConversion();
		zig.convert(str, 3);
	}
	
	public void convert(String str,int numRows) {
		char ch[] = str.toCharArray();
		int length = str.length();
		char[][] arr = new char[length][length];
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<numRows;j++) {
				arr[i][j] = ch[j];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
