package com.String;

import java.util.Stack;

public class ReverseAString {
	public static void main(String[] args) {
		System.out.println(reverse("  hello world  "));
	}
	
	public static String reverse(String s) {
		Stack<String> stack = new Stack<>();
		String string = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				stack.push(string);
				string = "";
			}else{
				string += s.charAt(i);
			}
		}
		String ans = "";
		while(stack.size()!= 1) {
			if(stack.peek()== "" || stack.peek()==" ") {
				stack.pop();
				continue;
			}
			ans += stack.peek()+" ";
			stack.pop();
		}
		ans += stack.peek();
		return ans;
	}
}
