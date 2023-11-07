package rouff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JpFina {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,6,7,8,9));
		JpFina jp = new JpFina();
		jp.max(list);
	}
	
	public void max(List<Integer> list) {
		Collections.sort(list);
		double minimum = Integer.MAX_VALUE;
		for(int i=0;i<list.size()-1;i++) {
			int current = list.get(i+1)-list.get(i);
			if(current<minimum) {
				minimum = current;
				System.out.println(list.get(i)+" "+list.get(i));
			}
		}
	}
}
