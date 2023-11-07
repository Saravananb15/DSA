package pattern;

public class PatternFifteen {
	public static void main(String[] args) {
		patternFifteen(5);
	}

	public static void patternFifteen(int num) {
		char ch = 65;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			ch = 65;
		}
	}
}
