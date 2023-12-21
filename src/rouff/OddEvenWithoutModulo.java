package rouff;

public class OddEvenWithoutModulo {
	public static void main(String[] args) {
		oddEven(21);
	}
	public static void oddEven(int n) {
		if((n&1) == 1) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
	}
}
