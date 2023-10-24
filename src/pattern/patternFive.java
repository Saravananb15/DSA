package pattern;

public class patternFive {
	public static void main(String[] args) {
		patternFivePrint(5);
	}
	public static void patternFivePrint(int num) {
		for(int i=num;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
