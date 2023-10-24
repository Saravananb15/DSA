package pattern;

public class PatternSeven {
	public static void main(String[] args) {
		patternSixPrint(5);
	}

	public static void patternSixPrint(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = num-i-1; j >0; j--) {
				System.out.print(" ");
			}
			for(int k= i *2+1;k>0;k--) {
				System.out.print("*");
			}
			for (int j = num-i-1; j >0; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
