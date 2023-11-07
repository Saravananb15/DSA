package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingMap {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1,12,3,2};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			int ch = sc.nextInt();
			if(map.containsKey(ch)) {
				System.out.println(map.get(ch));
			}
		}
		
		
//		for(Map.Entry<Integer, Integer> mapper : map.entrySet()) {
//			System.out.println(mapper.getKey()+" "+mapper.getValue());
//		}
	}
}
