package Strings;

import java.util.HashSet;
import java.util.Set;

public class SubString {
	public static void main(String[] args) {
		String str = "abcabcaa";
		SubString ss = new SubString();
		Set<String> set = ss.lengthOfLongestSubstring(str);
		for(String i: set) {
			System.out.println(i);
		}
	}

	public Set<String> lengthOfLongestSubstring(String s) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)!= s.charAt(j)) {
					char ch = (char) (s.charAt(i) +s.charAt(j));
					String str = ""+ch;
					set.add(str);
				}else {
					char ch = s.charAt(i);
					String str = ""+ch;
					set.add(str);
				}
				
			}
		}
		return set;
	}
}
