package rouff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JPCountAfterRemove {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 2));
		int m =2;
		int res = count(list, m);
		System.out.println(res);
	}

	public static int count(List<Integer> ids, int m) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int id : ids) {
			map.put(id, map.getOrDefault(ids, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> idFrequency = new ArrayList<>(map.entrySet());
		idFrequency.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

		for (int i = 0; i < m; i++) {
			if (!idFrequency.isEmpty()) {
				int frequency = idFrequency.get(0).getValue();

				if (frequency > 1) {
					idFrequency.get(0).setValue(frequency - 1);
				}
				idFrequency.remove(0);
			}
			
		}

		return idFrequency.size();

	}
}
