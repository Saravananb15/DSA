package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3,4,2,1,5));
		SortArrayList sr = new SortArrayList();
//		sr.selectionSort(list);
		sr.bubbleSort(list);
		for(int i : list) {
			System.out.println(i);
		}
	}
	
	public void selectionSort(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int replace = 0;
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)<list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					replace++;
				}
			}
			if(replace == 0) {
				break;
			}
		}
	}
	
	public void bubbleSort(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			int replace = 0;
			for(int j=0;j<list.size()-1;j++) {
				if(list.get(j)>list.get(j+1)) {
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
					replace++;
				}
			}
			if(replace == 0) {
				break;
			}
		}
	}
	
	public void insertionSort(List<Integer> list) {
		
	}
}
