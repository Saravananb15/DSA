package rouff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
//		System.out.println(is_palindrome(121221));
		System.out.println(isSubSequence("BAT", "BATMAN"));
	}

	public static int climbStairs(int n) {
		if (n <= 2)
			return n;
		int current = 0;
		int prev1 = 1, prev2 = 2;
		for (int i = 1; i < n - 1; i++) {
			current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		return current;
	}

	public static String is_palindrome(int n) {
		// Code here
		List<Integer> list = new ArrayList<Integer>();
		while (n > 0) {
			list.add(n % 10);
			n = n / 10;
		}
		String res = "No";

		int low = 0, high = list.size() - 1;
		while (low <= high) {
			if (list.get(low) == list.get(high)) {
				res = "Yes";
			} else {
				res = "No";
				break;
			}
			low++;
			high--;

		}
		return res;
	}

	static boolean isSubSequence(String A, String B) {
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<B.length();i++) {
			map.put(B.charAt(i), i);
		}
		int index = 0;
		for(int i=0;i<A.length();i++) {
			if(map.containsKey(A.charAt(i))) {
				int value = map.get(A.charAt(i));
				if(value > index ) {
					index = value;
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
