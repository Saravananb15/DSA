package pattern;

public class PatternSix {
	public static void main(String[] args) {
		patternSixPrint(6);
	}
	public static void patternSixPrint(int num) {
		for(int i=0;i<num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
