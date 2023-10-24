package IntegerPractice;

public class ReverseInteger {
	public static void main(String[] args) {
		int digit = 1534236469;
		int res = reverse(digit);
		System.out.println(res);
	}
	
	public static int reverse(int x) {
		long reverse = 0;
		while(x!=0) {
			reverse += x%10;
			reverse *= 10;
			x /=10;
		}
		reverse /=10;
		if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE) {
			return 0;
		}
		return (int)reverse;
	}
}
