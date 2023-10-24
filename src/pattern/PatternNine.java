package pattern;

public class PatternNine {
	public static void main(String[] args) {
		patternNine(5);
	}

	public static void patternNine(int num) {
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
		for (int i = num-1; i >=0; i--) {
			for (int j = 0; j <num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = i * 2 + 1; k > 0; k--) {
				System.out.print("*");
			}
			for (int j = 0; j <num - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
