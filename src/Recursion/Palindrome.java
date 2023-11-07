package Recursion;

public class Palindrome {
	public static void main(String[] args) {
		boolean bool = isPalindrome("11211", 0);
		if(bool) {
			System.out.println("Is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
	
	public static boolean isPalindrome(String str, int initial) {
		if(initial >= str.length()/2)return true;
		if(str.charAt(initial) != str.charAt(str.length()-initial-1)) {
			return false;
		};
		return isPalindrome(str, initial+1);
	}
}
