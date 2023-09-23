package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MergerTwoSortedList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,4,5));
		List<Integer> out = merge(list, list1);
		Iterator<Integer> itr = out.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static List<Integer> merge(List<Integer> list, List<Integer> list1){
		Iterator<Integer> itr = list1.iterator();
		while(itr.hasNext()) {
			list.add(itr.next());
		}
		list.sort(null);
		return list;
	}
}
