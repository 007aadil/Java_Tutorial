package org.sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonValues {
	public static void main(String[] args) {
		Set <Integer> s1 =new LinkedHashSet<> ();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		
		System.out.println("set 1:" + s1);
		
		Set <Integer> s2 =new LinkedHashSet<> ();
		s2.add(10);
		s2.add(20);
		s2.add(60);
		s2.add(50);
		s2.add(40);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		
		System.out.println("set2 :" + s2);
		
		s2.retainAll(s1);
		
		System.out.println("Common Values :" + s2);
	}

}
