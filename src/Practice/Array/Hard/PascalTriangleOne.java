package Practice.Array.Hard;

public class PascalTriangleOne {
	public static void main(String[] args) {
		int row = 5;
		int column = 3;
		printRC(row-1, column-1);
	}	
	public static void printRC(int row , int column){
		int res = 1;
		for(int i=0;i<column;i++) {
			res = res*(row-i);
			res /= (i+1);
		}
		System.out.println(res);
	}
}
