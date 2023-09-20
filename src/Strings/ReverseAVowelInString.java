package Strings;

public class ReverseAVowelInString {
	public static void main(String[] args) {
		String str = "leetcode";
		String res = vowel(str);
		System.out.println(res);
	}
	
	public static String vowel(String str) {
		char[] Actual = {'a','e','i','o','u'};
		int[] index = new int[str.length()];
		char[] string = str.toCharArray();
		char[] chars = new char[str.length()];
		
			for(int j=0;j<Actual.length;j++) {
				for(int i=0;i<str.length();i++) {
				if(Actual[j]== string[i]) {
					index[i]=i; 
					chars[i]= string[i];
				}
			}
		}
		String output = new String();
		for(int i=string.length-1;i>0;i--) {
			if(chars[i] == ' ') {
				break;
			}else {
				string[index[i]]= chars[i];
				output += string[i];
			}
		}
		return output+string[0];
	}
}
