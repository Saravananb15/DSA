package pattern;

public class fullPattern {
	public static void main(String[] args) {
		fullPattern fp = new fullPattern();
		fp.patterWithGivenRange(10);
	}
	
	public void patterWithGivenRange(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
