package rouff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeating {
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(
				Arrays.asList(1,20),
				Arrays.asList(9,19));
		repeating(list);
	}

	public static void repeating(List<List<Integer>> list) {
		for (List<Integer> range : list) {
			int lowerbound = range.get(0);
			int upperBound = range.get(1);
			int count = 0;

			for (int i = lowerbound; i <= upperBound; i++) {
				if (hasNoRepeating(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static boolean hasNoRepeating(int num) {
		Set<Integer> set = new HashSet<>();
		while (num > 0) {
			int n = num % 10;
			if (set.contains(n)) {
				return false;
			}
			set.add(n);
			num /= 10;
		}
		return true;
	}
}
