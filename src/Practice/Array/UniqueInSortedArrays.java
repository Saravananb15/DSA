package Practice.Array;

import java.util.Set;
import java.util.TreeSet;

public class UniqueInSortedArrays {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,1,1,2};
		int arr2[] = {1,2,3,4,4,2};
		UniqueInSortedArrays unique = new  UniqueInSortedArrays();
		unique.check(arr1, arr2);
	}
	public void check(int arr1[],int arr2[]) {
		Set<Integer> set = new TreeSet<>();
		for(int i=0;i<arr1.length;i++) {
			if(!set.contains(arr1[i])) {
				set.add(arr1[i]);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(!set.contains(arr2[i])) {
				set.add(arr2[i]);
			}
		}
		
		
		for(int i : set) {
			System.out.println(i);
		}
	}
}
