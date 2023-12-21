package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public static void main(String[] args) {
		ValidAnagram valid = new ValidAnagram();
		String input = "anagram";
		String expected = "nagaram";
		System.out.println(valid.valid(input, expected));
	}
	public boolean valid(String s, String t) {
		if(s.length()!= t.length())return false;
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> targetMap = new HashMap<>();
		int count=0;
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			targetMap.put(t.charAt(i), targetMap.getOrDefault(t.charAt(i), 0)+1);
		}
		for(int i=0;i<t.length();i++) {
			if(map.containsKey(t.charAt(i))) {
				int inputCount = map.get(t.charAt(i));
				int targetCount = targetMap.get(t.charAt(i));
				if(inputCount == targetCount) {
					map.remove(t.charAt(i));
				}
			}
		}
		if(map.size()==0)return true;
		return false;
	}
}
