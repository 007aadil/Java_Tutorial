package com.info;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class IterationofKeyandValues3 {
	public static void main(String[] args) {
		Map<Character, Integer> m1 = new TreeMap<>();
		m1.put('!', 10);
		m1.put('@', 20);
		m1.put('$', 30);
		m1.put('%', 40);
		m1.put('^', 50);
		m1.put('&', 60);
		m1.put('*', 10);
		m1.put('(', 50);
		m1.put(')', 40);

		Set<Entry<Character, Integer>> values = m1.entrySet();
		for (Entry<Character, Integer> entry : values) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
