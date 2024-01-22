package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagramSorting {
	public static void main(String[] args) {
		ValidAnagramSorting valid = new ValidAnagramSorting();
		String input = "a";
		String expected = "ab";
		System.out.println(valid.valid(input, expected));
	}
	public boolean valid(String s, String t) {
		if(s.length()!=t.length())return false;
		char[] sString = s.toCharArray();
		char[] tString = t.toCharArray();
		Arrays.sort(sString);
		Arrays.sort(tString);
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(sString[i]==tString[i]) {
				count++;
			}
		}
		if(count==s.length())return true;
		return false;
	}
}
