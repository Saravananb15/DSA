package Recursion;

public class SumUsingFunctional {
	public static void main(String[] args) {
		SumUsingFunctional sf = new SumUsingFunctional();
		int res = sf.summation(3);
		System.out.println(res);
	}
	
	public int summation(int i) {
		if(i==0) {
			return 0;
		}
		return i+summation(i-1);
	}
}
