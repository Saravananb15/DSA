package com.String;

import java.util.HashSet;
import java.util.Set;

public class IsomorphicString {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
	}

	public static boolean isIsomorphic(String s, String t) {
		Set<Character> set = new HashSet<>();
		Set<Character> dupli = new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(int i=0;i<t.length();i++) {
			dupli.add(t.charAt(i));
		}
		if(set.size()==dupli.size()) {
			return true;
		}
		return false;
	}
}
