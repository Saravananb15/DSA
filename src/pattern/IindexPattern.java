package pattern;

public class IindexPattern {
	public static void main(String[] args) {
		IindexPattern ip = new IindexPattern();
		ip.pattern(4);
	}
	
	public void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
