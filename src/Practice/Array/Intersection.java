package Practice.Array;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,3,4,5,6};
		int[] arr2 = {2,3,3,5,6,7};
		Intersection inter = new Intersection();
		inter.intersection(arr1, arr2);
	}
	
	public void intersection(int arr1[],int arr2[]) {
		List<Integer> list = new ArrayList<>();
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				i++;
			}else if(arr2[j]<arr1[i]) {
				j++;
			}else {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		for(int res : list) {
			System.out.println(res);
		}
	}
}
