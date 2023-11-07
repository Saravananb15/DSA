package Recursion;

public class OneToNBacktracking {
	public static void main(String[] args) {
		OneToNBacktracking one = new OneToNBacktracking();
		one.backtracking(5);
	}
	
	public void backtracking(int n) {
		if(n <= 0) return;
		
		backtracking(n-1);
		System.out.println(n);
	}
}
