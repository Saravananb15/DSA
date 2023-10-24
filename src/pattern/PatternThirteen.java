package pattern;

public class PatternThirteen {
	public static void main(String[] args) {
		patternThirteen(5);
	}
	
	public static void patternThirteen(int num) {
		int val = 1;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
	}
}
