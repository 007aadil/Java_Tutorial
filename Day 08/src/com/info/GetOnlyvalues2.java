package com.info;

import java.util.Map;
import java.util.TreeMap;

public class GetOnlyvalues2 {
	public static void main(String[] args) {
		Map<Character, Integer> m1 = new TreeMap<>();
		m1.put('!',10);
		m1.put('@',20);
		m1.put('$',30);
		m1.put('%',40);
		m1.put('^',50);
		m1.put('&',60);
		m1.put('*',10);
		m1.put('(',50);
		m1.put(')',40);
		
		System.out.println("GetValues:"+ m1.values());
		}

}
