package rouff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JPNonRepeating {
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(80,120),Arrays.asList(9,19));
		countRepeat(list);
	}
	public static void countRepeat(List<List<Integer>> ranges) {
		for(List<Integer> range : ranges) {
			int lowerBound = range.get(0);
			int upperBound = range.get(1);
			int count =0;
			
			for(int i=lowerBound;i<=upperBound;i++) {
				if(hasRepeating(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	private static boolean hasRepeating(int num) {
		Set<Integer> set = new HashSet<>();
		while(num>0) {
			int n= num%10;
			if(set.contains(n)) {
				return false;
			}
			set.add(n);
			num /=10;
		}
		return true;
	}
}
