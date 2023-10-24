package pattern;

public class PatternEleven {
	public static void main(String[] args) {
		patternEle(5);
	}
	public static void patternEle(int num) {
		int start = 1;
		for(int i=0;i<num;i++) {
			if( i % 2 == 0 ) start = 1;
			else start =0;
			for(int j=0;j<=i;j++) {
				System.out.print(start+" ");
				start = 1-start;
			}
			System.out.println();
		}
	}
}
