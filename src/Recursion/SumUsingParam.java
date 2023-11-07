package Recursion;

public class SumUsingParam {
	public static void main(String[] args) {
		SumUsingParam sp = new SumUsingParam();
		sp.summation(3, 0);
	}
	public void summation(int i,int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		
		summation(i-1, sum+i);
	}
}
