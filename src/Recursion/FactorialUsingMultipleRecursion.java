package Recursion;

public class FactorialUsingMultipleRecursion {
	public static void main(String[] args) {
		FactorialUsingMultipleRecursion fr = new FactorialUsingMultipleRecursion();
		int res = fr.recursion(4);
		System.out.println(res);
	}
	public int recursion(int n) {
		if(n <= 1) return n;
		int last = recursion(n-1);
		int secondLast = recursion(n-2);
		return last+secondLast;
	}
}
