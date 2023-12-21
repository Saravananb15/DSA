package Strings;

public class MergeStrings {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "pqr";
		String res = merge(str1, str2);
		System.out.println(res);
	}

	public static String merge(String word1, String word2) {
		StringBuilder merged = new StringBuilder();
		int str1len = word1.length();
		int str2len = word2.length();
		int index = 0;
		int i = 0, j = 0;
		while (i < str1len && j < str2len) {
			if (index % 2 == 0) {
				merged.append(word1.charAt(i++));
			} else {
				merged.append(word2.charAt(j++));
			}
			index++;
		}
		if (i < str1len)
			merged.append(word1.substring(i, str1len));
		if (j < str2len)
			merged.append(word2.substring(j, str2len));
		return merged.toString();
	}
}
