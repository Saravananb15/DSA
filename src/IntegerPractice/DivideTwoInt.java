package IntegerPractice;

public class DivideTwoInt {
	public static void main(String[] args) {
		int divident = -1;
		int divisor = -1;
		String str = "hello";
		str.indexOf("hel");
		DivideTwoInt dit = new DivideTwoInt();
		int res = dit.divide(divident, divisor);
		System.out.println(res);
	}

	public int divide(int dividend, int divisor) {
		if(dividend == 0 || divisor == 0) return 0;
		int temp = dividend;
		long result = 0;
		if (divisor < 0) {
			if(dividend == divisor) return -1;
			divisor = divisor * -1;
			while (temp > divisor) {
				temp = temp - divisor;
				result--;
			}
		} else {
			if(dividend == divisor) return 1;
			while (temp > divisor) {
				temp = temp - divisor;
				result++;
			}
		}
		if(result!=0) return (int)result;
		return  -1;
	}
}
