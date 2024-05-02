package com.String;

import java.util.Stack;

public class RemoveOutmostParentheses {
	public static void main(String[] args) {
		System.out.println(removeOuterParenthesesStr("(()())(())"));
	}

	public static String removeOuterParenthesesStr(String s) {
		Stack<Character> stack = new Stack<>();
		int close=0,open=1;
		for(int i=1;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch =='(') {
				open++;
				stack.push(ch);
			}else {
				close++;
				stack.push(ch);
			}
			if(open == close) {
				stack.pop();
				close=0;
				open=1;
				i++;
			}
		}
		String str= "";
		while(!stack.isEmpty()) {
			str += stack.pop();
		}
		String ans = "";
		for(int i=str.length()-1;i>=0;i--) {
			ans += str.charAt(i);
		}
		return ans;
		
		
	}
}
