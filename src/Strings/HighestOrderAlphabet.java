package Strings;

public class HighestOrderAlphabet {
	public static void main(String[] args) {
		String str = "abcdehijmnohpqrhst";
		int initial = str.charAt(0);
		int next = initial + 1;
		int count = 1;
		int finalCount = 0;
		int start = 0;
		int end = 0;
		for (int i = 1; i < str.length(); i++) {
			if (next == (int) str.charAt(i)) {
				count++;
				next++;
				if (count > finalCount) {
					finalCount = count;
					end = i;
				}
			} else {
				count = 1;
				next = (int) str.charAt(i) + 1;
			}

		}
		start = end-finalCount+1;

		for(int i=start;i<=end;i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println(finalCount);
	}
}
