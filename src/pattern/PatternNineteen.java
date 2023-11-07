package pattern;

public class PatternNineteen {
	public static void main(String[] args) {
		patternNineteen(15);
	}
	
	
	public static void patternNineteen(int num) {
		char ch = (char) (64+num);
		
		for(int i=0;i<num;i++) {
			char temp = ch;
			for(int j=0;j<=i;j++) {
				System.out.print(temp);
				temp++;
			}
			System.out.println();
			ch= (char) (ch-1);
		}
	}
}
