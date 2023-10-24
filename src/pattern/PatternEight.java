package pattern;

public class PatternEight {
	public static void main(String[] args) {
		patternSixPrint(5);
	}

	public static void patternSixPrint(int num) {
		for (int i = num-1; i >=0; i--) {
			for (int j = 0; j <num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = i * 2 + 1; k > 0; k--) {
				System.out.print("*");
			}
			for (int j = 0; j <num - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
