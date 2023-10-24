package rouff;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreams {
	public static void main(String[] args) {
		String s = "adbjwbfkjkalkdz";
		
		Map<Character, Long> map = s.chars().mapToObj(str -> Character.toLowerCase(Character.valueOf((char)str)))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		
		
		Stream<Map.Entry<Character, Long>> first = s.chars().mapToObj(str -> Character.toLowerCase(Character.valueOf((char)str)))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream()
				.filter(x -> x.getValue()==1);
		
		Iterator<Map.Entry<Character, Long>> itr = first.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
	}
}
