package pattern;

public class PatternTen {
	public static void main(String[] args) {
		patternTen(5);
	}
	
	public static void patternTen(int num) {
		for(int i=1;i<=2*num-1;i++) {
			int start = i;
			if(i > num)start = 2*num-i;
			for(int j=1;j<=start;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
