package pattern;

public class PatternFour {

	public static void main(String[] args) {
		pattern4(3);
	}

	public static void pattern4(int num) {
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
}