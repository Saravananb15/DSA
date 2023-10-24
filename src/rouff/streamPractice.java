package rouff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamPractice {
	public static void main(String[] args) {
			List<Character> li = new ArrayList<>(Arrays.asList('a','b','c','c'));
			
			Optional<Character> si = li.stream().filter(n -> n== 'c').findAny();
			System.out.println(si);
	}
	
}
