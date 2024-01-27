package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abcabcbb";
		LongestSubstring longest = new LongestSubstring();
		System.out.println(longest.longestSubstring(str));
	}

	public int longestSubstring(String s) {
		int left = 0;
		int maxLongest =0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(!set.contains(s.charAt(i))) {
				maxLongest = Math.max(maxLongest, i-left+1);
				set.add(s.charAt(i));
			}else {
				while(s.charAt(left)!=s.charAt(i)) {
					set.remove(s.charAt(left));
					left++;
				}
				set.remove(s.charAt(left));left++;
				set.add(s.charAt(i));
			}
		}
		return maxLongest;
	}
}
