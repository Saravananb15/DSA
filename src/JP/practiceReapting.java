package JP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class practiceReapting {
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1,20),Arrays.asList(9,19));
		count(list);
	}

	public static void count(List<List<Integer>> ranges) {
		for (List<Integer> range : ranges) {
			int lowerBound = range.get(0);
			int upperBound = range.get(1);
			int count = 0;

			for (int i = lowerBound; i <= upperBound; i++) {
				if (hasRepeat(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static boolean hasRepeat(int num) {
		Set<Integer> set = new HashSet<>();
		while(num>0) {
			int n = num%10;
			if(set.contains(n)) {
				return false;
			}
			set.add(n);
			num /= 10;
		}
		return true;
	}
}
