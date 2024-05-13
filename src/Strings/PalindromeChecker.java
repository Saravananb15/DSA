package Strings;

import java.util.Arrays;

public class PalindromeChecker {

	// Function to check if a string is a palindrome
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		return str.equals(rev);
	}

	// Function to check if rearranged characters of a concatenated string can form
	// a palindrome
	public static boolean canFormPalindrome(String[] arr) {
		StringBuilder concatenated = new StringBuilder();
		for (String s : arr) {
			concatenated.append(s);
		}
		return isPalindrome(concatenated.toString());
	}

	public static void main(String[] args) {
		String[] stringArray = { "abc", "bca" };
		boolean result = canFormPalindrome(stringArray);
		System.out.println("Can the concatenated string form a palindrome? " + (result ? "Yes" : "No"));
	}
}
