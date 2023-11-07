package pattern;

public class PatternSeventeen {
	public static void main(String[] args) {
		patternSeventeen(5);
	}
	
	public static void patternSeventeen(int num) {
		char ch = 'A';
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}
