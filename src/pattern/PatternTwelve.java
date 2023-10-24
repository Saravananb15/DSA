package pattern;

public class PatternTwelve {
	public static void main(String[] args) {
			patternTwelve(5);
	}
	public static void patternTwelve(int num) {
		int space = 2*(num-1);
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=1;k<=space;k++ ) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
			space = space-2;
		}
	}
}
