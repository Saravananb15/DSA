package rouff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeRandomCase {
	public static void main(String[] args) {
		String s = "akjksdjjkfbajkdbjkbj";

		Map<Character, Long> res = s.chars().mapToObj(str -> Character.toLowerCase(Character.valueOf((char) str)))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(res);
		
		Stream<Map.Entry<Character, Long>> res1 = s.chars().mapToObj(str -> Character.toLowerCase(Character.valueOf((char) str)))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x -> x.getValue()==1);
		
		Iterator<Map.Entry<Character, Long>> irt = res1.iterator();
		while(irt.hasNext()) {
			System.out.println(irt.next());
		}
	
//		List<Map.Entry<Character,Long>> list = new ArrayList<>(res.entrySet());
//		for(Map.Entry<Character, Long> i : list) {
//			System.out.println(i);
//		}
//		
//		char result = list.get(0).getKey();
//		long resul = list.get(0).getValue();
//		System.out.println(result);
//		System.out.println(resul);
//		for(Map.Entry<Character, Long> set : res.entrySet()) {
//			System.out.println(set);
//		}
	}

}
