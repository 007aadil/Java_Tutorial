package com.info;

import java.util.HashMap;
import java.util.Map;

public class GetOnlyvalues {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(10, "java");
		m1.put(20, "sql");
		m1.put(30, "oops");
		m1.put(40, "sql");
		m1.put(50, "oracle");
		m1.put(60, "DB");
		m1.put(10, "selenium");
		m1.put(50, "psql");
		m1.put(40, "Hadoop");

		System.out.println("GetValues:" + m1.values());

	}

}
