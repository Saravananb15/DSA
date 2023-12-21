package Strings;

public class longestValidParantheses {
	public static void main(String[] args) {
		String str = ")()()";
		longestValidParantheses valid = new longestValidParantheses();
		int res = valid.longest(str);
		System.out.println(res);
	}
	public int longest(String s) {
		int result = 0;
		for(int i=0;i<s.length()-1;i++) {
			int count = 1;
			char symbol = s.charAt(i);
			if(symbol != s.charAt(i+1)) {
				count = 0;
			}else {
				count++;
			}
			result = Math.max(count, result);
		}
		return result*2;
	}
}
