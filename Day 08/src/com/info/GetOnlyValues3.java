package com.info;

import java.util.Hashtable;
import java.util.Map;

public class GetOnlyValues3 {
	public static void main(String[] args) {
		Map<String, String> m1 = new Hashtable<>();
		m1.put("apple", "selenium");
		m1.put("bat", "framework");
		m1.put("cat", "oracle");
		m1.put("dog", "corejava");
		m1.put("eat", "jira");
		m1.put("fish", "hadoop");

		System.out.println("GetKValues:" + m1.values());
	}

}
