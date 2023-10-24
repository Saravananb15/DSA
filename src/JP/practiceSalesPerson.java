package JP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practiceSalesPerson {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8,9));
		int res = noRepeat(list, 2);
		System.out.println(res);
	}

	public static int noRepeat(List<Integer> ids, int m) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int id : ids) {
			map.put(id, map.getOrDefault(id, 0)+1);
		}
		
		List<Map.Entry<Integer, Integer>> idFrequency = new ArrayList<>(map.entrySet());
//		idFrequency.sort((entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue()));

//		for(int i=0;i<m;i++) {
//			int frequency = idFrequency.get(0).getValue();
//			
//			if(frequency>1) {
//				idFrequency.get(0).setValue(frequency-1);
//			}else {
//				idFrequency.remove(0);
//			}
//		}
//		return idFrequency.size();
		
		int temp = m;
		while(temp>0) {
			if(idFrequency.get(0).getValue()<=temp) {
				temp = temp-idFrequency.get(0).getValue();
				idFrequency.remove(0);
			}else {
				temp =0;
			}
		}
		
		return idFrequency.size();
	}


}
