package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length())return false;
		Map<Character, Character> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				char ch = map.get(s.charAt(i));
				if(ch == t.charAt(i)) {
					continue;
				}else {
					return false;
				}
			}else if(map.containsValue(t.charAt(i))){
				return false;
			}
			else {
				map.put(s.charAt(i),t.charAt(i));
			}
		}
		return true;
	}
}
