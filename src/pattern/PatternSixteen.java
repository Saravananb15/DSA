package pattern;

public class PatternSixteen {
	public static void main(String[] args) {
		patternSixteen(5);
	}

	public static void patternSixteen(int num) {
		char ch = 65;
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			ch = 65;
		}
	}
}
