package org.sample;

import java.util.Set;
import java.util.TreeSet;

public class CreateTreeSet {
	public static void main(String[] args) {
		Set <Integer> s3 = new TreeSet();
		s3.add(10);
		s3.add(20);
		s3.add(30);
		s3.add(40);
		s3.add(50);
		s3.add(60);
		s3.add(70);
		s3.add(80);
		s3.add(90);
		s3.add(10);
		s3.add(20);
		
		System.out.println("Add Values in Treeset" + s3);
		}

}
