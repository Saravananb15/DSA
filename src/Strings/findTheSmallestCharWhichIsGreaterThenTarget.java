package Strings;

public class findTheSmallestCharWhichIsGreaterThenTarget {

	public static void main(String[] args) {
		char[] ch = { 'c', 'f', 'j' };
		char target = 'a';
		findTheSmallestCharWhichIsGreaterThenTarget fs = new findTheSmallestCharWhichIsGreaterThenTarget();
		char out = fs.nextGreatestLetter(ch, target);
		System.out.println(out);
	}

	public char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < letters[mid]) {
				end = mid - 1;
			}else{
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}
}
