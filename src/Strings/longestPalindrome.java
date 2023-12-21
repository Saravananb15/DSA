package Strings;

public class longestPalindrome {
	public static void main(String[] args) {
		String str = "bb";
		longestPalindrome lon = new longestPalindrome();
		System.out.println(lon.longestpalin(str));
	}
	public String longestpalin(String s) {
		if(s.length()==1) return s;
		int max = Integer.MIN_VALUE;
		String result = null;
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<=s.length();j++) {
				String spilt = s.substring(i,j);
				if(isPalin(spilt) && spilt.length()>max) {
					max = Math.max(max, spilt.length());
					result = spilt;
				}
			}
		}
		return result;
	}
	public boolean isPalin(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left<=right) {
			if(str.charAt(left)==str.charAt(right)) {
				left++;
				right--;
			}else {
				return false;
			}
		}
		return true;
	}
}
