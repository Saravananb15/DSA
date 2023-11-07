package Recursion;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		FactorialUsingRecursion fr = new FactorialUsingRecursion();
//		fr.factorialUsingParam(4);
		int res = fr.factorialUsingFunction(4);
		System.out.println(res);
	}
	int fact =1;
	public void factorialUsingParam(int n) {
		if(n < 1) {
			System.out.println(fact);
			return;
		}
		fact = fact*n;
		factorialUsingParam(n-1);
	}
	
	public int factorialUsingFunction(int n) {
		if(n==0)return 1;
		return n*factorialUsingFunction(n-1);
	}
}
