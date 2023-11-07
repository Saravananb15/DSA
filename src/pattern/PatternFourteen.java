package pattern;

public class PatternFourteen {
	public static void main(String[] args) {
		patternFourteen(5);
	}
	public static void patternFourteen(int num) {
		char ch = 65;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			ch = 65;
		}
	}
}
