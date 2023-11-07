package Recursion;

public class RecursionNto1 {
	public static void main(String[] args) {
		RecursionNto1 nto1= new RecursionNto1();
		nto1.printNto1(5);
	}
	
	public void printNto1(int n) {
		if(n == 0) return;
		System.out.println(n);
		n--;
		printNto1(n);
	}
}
