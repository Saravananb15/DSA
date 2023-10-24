package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class rouff {
	public static void main(String[] args) {
		List<List<Integer>> ranges = Arrays.asList(Arrays.asList(1,20),Arrays.asList(9,19));
		countNumbers(ranges);
	}
	
	public static void countNumbers(List<List<Integer>> ranges) {
		for(List<Integer> range : ranges) {
			int lowerBound = range.get(0);
			int upperBound = range.get(1);
			int count =0;
			
			for(int i=lowerBound;i<=upperBound;i++) {
				if(hasNoRepeat(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	public static boolean hasNoRepeat(int num) {
		Set<Integer> digits = new HashSet<>();
		while(num>0) {
			int digit = num % 10;
			if(digits.contains(digit)) {
				return false;
			}
			digits.add(digit);
			num/=10;
		}
		return true;
		
	}
}
