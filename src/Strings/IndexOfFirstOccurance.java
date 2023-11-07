package Strings;

public class IndexOfFirstOccurance {
	public static void main(String[] args) {
		String str = "dsdsadbutsad";
		
		String sub = "sadgd";
		IndexOfFirstOccurance iop = new IndexOfFirstOccurance();
		int res = iop.strStr(str, sub);
		System.out.println(res);
	}

	public int strStr(String haystack, String needle) {
		int index = haystack.indexOf(needle);
		return index;
		
	}

}
