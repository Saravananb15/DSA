package rouff;

import java.util.HashSet;
import java.util.Set;

public class rouff {
	public static void main(String[] args) {
		rouff rou = new rouff();
		System.out.println(rou.isPalindrome(121));
	}

	public boolean isPalindrome(int x) {
		String palin = String.valueOf(x);
		int n = palin.length();
		
		for(int i=0;i<n/2;i++) {
			if(palin.charAt(i) != palin.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
}
