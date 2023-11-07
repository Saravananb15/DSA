package Recursion;

public class NtoOneBacktracking {
	public static void main(String[] args) {
		NtoOneBacktracking n = new NtoOneBacktracking();
		n.backtracking(5);
	}
	int i=0;
	public void backtracking(int n) {
		if(i == n)return;
		i++;
		backtracking(n);
		System.out.println(i);
		i--;
	}
}
