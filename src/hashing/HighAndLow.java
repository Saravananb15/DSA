package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighAndLow {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,3,4,3};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println("Enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		int result1 = 0,result2 = 0;
		if(map.containsKey(val1)) {
			result1 = map.get(val1);
		}
		if(map.containsKey(val2)) {
			result2 = map.get(val2);
		}
		if(result1 > result2 ) {
			System.out.println("The frequency of "+val1+" is "+result1 +" which is greater and the frequency of "
					+ val2+" is "+result2 + " which is lower");
		}else {
			System.out.println("The frequency of "+val1+" is "+result1 +" which is lower and the frequency of "
					+ val2+" is "+result2 + " which is higher");
		}
		
	}
}
