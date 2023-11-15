package Array;

//import java.util.HashMap;
//import java.util.Map;

public class NumberAppearsForOneTime {
	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,4,4};
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < arr.length; i++) {
//			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//		}
//		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
//			if (it.getValue() == 1) {
//				System.out.println(it.getKey());
//			}
//		}
		
		int xor = 0;
		
		for(int i=0;i<arr.length;i++) {
			xor = xor^arr[i];
		}
		System.out.println(xor);
	}
}
