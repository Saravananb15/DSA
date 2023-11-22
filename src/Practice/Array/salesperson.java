package Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class salesperson {
	public static int deleteProducts(List<Integer> ids, int m) {
		Map<Integer, Integer> idCounts = new HashMap<>();
		
		for(int id:ids) {
			idCounts.put(id, idCounts.getOrDefault(id, 0)+1);
		}
		
		List<Map.Entry<Integer, Integer>> idFrequencies	= new ArrayList<>(idCounts.entrySet());
		idFrequencies.sort((entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue()));
		
		
		for(int i=0;i<m;i++) {
			if(!idFrequencies.isEmpty()) {
				int frequency = idFrequencies.get(0).getValue();
				
				if(frequency > 1) {
					idFrequencies.get(0).setValue(frequency-1);
				}else {
					idFrequencies.remove(0);
				}
			}
		}
		int distinctIds = idFrequencies.size();
		return distinctIds;
		
	}
	
	public static void main(String[] args) {
		List<Integer> ids = Arrays.asList(1,1,1,1,1,5,6,6,7,2,3,2);
		int m =2;
		int result = deleteProducts(ids, m);
		System.out.println(result);
	}
}
