package Strings;

public class FirstPalindrome {
	public static void main(String[] args) {
		String str[] = { "abc", "car", "ada", "racecar", "cool" };
		FirstPalindrome fp = new FirstPalindrome();
		String res = fp.firstPalindrome(str);
		System.out.println(res);
	}

	public String firstPalindrome(String[] words) {
		for(String word : words) {
			if(checkPalindrome(word)) {
				return word;
			}
		}
		return "";
	}
	
	public boolean checkPalindrome( String word) {
		int first = 0;
		int last = word.length()-1;
		while(first < last) {
			if(word.charAt(last) != word.charAt(first)) {
				return false;
			}
			first++;
			last--;
		}
	 	return true;
	}
}
