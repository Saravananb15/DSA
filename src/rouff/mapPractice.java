package rouff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapPractice {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,2));
		int m = 2;
		int res = deletePr1oducts(list, m);
		System.out.println(res);
	}

	public static int deletePr1oducts(List<Integer> ids, int m) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int id : ids) {
			map.put(id, map.getOrDefault(id, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

		for (int i = 0; i < m; i++) {
			if (!list.isEmpty()) {
				int frequency = list.get(0).getValue();

				if (frequency > 1) {
					list.get(0).setValue(frequency - 1);
				} else {
					list.remove(0);
				}
			}
		}
		return list.size();
	}
}
