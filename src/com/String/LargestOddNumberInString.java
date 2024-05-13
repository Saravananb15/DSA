package com.String;

public class LargestOddNumberInString {
	public static void main(String[] args) {
		System.out.println(largestOddNumber("589"));
	}

	public static String largestOddNumber(String num) {
		StringBuilder sb = new StringBuilder(num);
		int op =0;
		for(int i=num.length()-1;i>=0;i--) {
			if(num.charAt(i)%2!=0) {
				op =1;
				sb.setLength(i+1);
				break;
			}
		}
		if(op==1) {
			return sb.toString();
		}else {
			return "";
		}
	}
}
