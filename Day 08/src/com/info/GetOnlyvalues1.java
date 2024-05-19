package com.info;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetOnlyvalues1 {
	public static void main(String[] args) {
		Map<Integer, Integer> m1 = new LinkedHashMap<>();
		m1.put(10, 10);
		m1.put(20, 20);
		m1.put(30, 30);
		m1.put(40, 40);
		m1.put(50, 50);
		m1.put(60, 60);
		m1.put(10, 10);
		m1.put(50, 50);
		m1.put(40, 40);

		System.out.println("GetValues:" + m1.values());

	}

}
