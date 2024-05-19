package com.info;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class IterationofKeyAndValues1 {
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
		Set<Entry<Integer, Integer>> values = m1.entrySet();
		for (Entry<Integer, Integer> entry : values) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
	}

}
