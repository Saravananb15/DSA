package leetcode;

public class SwapWithoutExtraVariable {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("Val of a : "+ a +" Value of b is : "+b);
	}
}
