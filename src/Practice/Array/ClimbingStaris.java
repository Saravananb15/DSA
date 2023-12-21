package Practice.Array;

public class ClimbingStaris {
	public static void main(String[] args) {
		ClimbingStaris stairs = new ClimbingStaris();
		int res = stairs.stairs(2);
		System.out.println(res);
	}
	public int stairs(int n) {
		int res = n*(n-1)/2;
		return res;
	}
}
