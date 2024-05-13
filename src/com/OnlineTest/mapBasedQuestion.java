package com.OnlineTest;

import java.util.HashMap;
import java.util.Map;

public class mapBasedQuestion {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 1);
		map.put(1, 4);
		map.put(1, null);
		map.put(1, null);
	}
}
