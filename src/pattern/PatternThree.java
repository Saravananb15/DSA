package pattern;

public class PatternThree {

	public static void main(String[] args) {
		pattern3(3);
	}

	public static void pattern3(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
