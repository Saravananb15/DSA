package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListImpl {
		public static void main(String[] args) {
//			List<String> list = new ArrayList<>(Arrays.asList("Sarvan","sarvan","sARVAN"));
			List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
			System.out.println(list);
			for(int i : list) {
				System.out.print(i+ " ");
			}
		}
}
