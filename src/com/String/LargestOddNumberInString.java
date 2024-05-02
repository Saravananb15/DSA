package com.String;

public class LargestOddNumberInString {
	public static void main(String[] args) {
		System.out.println(largestOddNumber("52"));
	}

	public static String largestOddNumber(String num) {
		int largest =0;
		for(int i=0;i<num.length();i++) {
			char ch = num.charAt(i);
			int StringToInt = (int) ch;
			largest = Math.max(largest, StringToInt);
		}
		String ans = "";
		ans+= largest;
		return ans;
	}
}
