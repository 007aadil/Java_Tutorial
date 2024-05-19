package org.sample;

import java.util.HashSet;
import java.util.Set;

public class GetEnhancedForLoop {
	public static void main(String[] args) {
		
		Set <Integer> s2 = new HashSet<>();	
		
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		s2.add(10);
		s2.add(20);
		
		System.out.println("Iterate each value in the set by using enhanced for loop");
		
		for (Integer i : s2) {
			System.out.println(i);}
		
		}
	}

