package pattern;

public class PatternEighteen {
	public static void main(String[] args) {
		patternEighteen(5);
	}

	public static void patternEighteen(int num) {
		for (int i = 0; i < num; i++) {
			//space
			for (int j = num - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			
			//character
			char ch = 'A';
			int breakpoint = (num*2+1)/2;
			for (int k = 1;k<=2*i +1;k++) {
				System.out.print(ch);
				if(k <= breakpoint) ch++;
				else ch--;
			}
			
			//space
			for (int j = num - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
