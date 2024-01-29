package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagram {
	public static void main(String[] args) {
//		String[] str = {"eat","tea","tan","ate","nat","bat"};
		String[] str = {"a"};
		GroupAnagram ga = new GroupAnagram();
		List<List<String>> list = ga.groupAnagrams(str);
		for(int i=0;i<list.size();i++) {
			for(String ans : list.get(i)) {
				System.out.println(ans);
			}
		}
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list = new ArrayList<>();
		if(strs.length <=1) {
		}
		
		return list;
	}
}
