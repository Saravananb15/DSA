package IntegerPractice;

public class DivideTwoNumber {
	public static void main(String[] args) {
		int div = 7;
		int divi = -3;
		int res = divide(div, divi);
		System.out.println(res);
	}

	public static int divide(int dividend, int divisor) {
		int result = 0;
		while (dividend > divisor) {
			if (divisor < 0) {
 				dividend = dividend + divisor;
				result = result - 1;
			} else {
				dividend = dividend - divisor;
				result++;
			}
		}

		return result;
	}
}
