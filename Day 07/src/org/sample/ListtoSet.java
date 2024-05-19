package org.sample;

import java.util.List;
import java.util.Set;
import java.util.LinkedList;
import java.util.HashSet;


public class ListtoSet {
	public static void main(String[] args) {
		List<Integer> s1 = new LinkedList<> ();
		 s1.add(105);
		 s1.add(205);
		 s1.add(305);
		 s1.add(405);
		 s1.add(505);
		 s1.add(605);
		 s1.add(705);
		 s1.add(805);
		 s1.add(505);
		 s1.add(605);
		 
		 System.out.println("List:" + s1);
		 
		 Set <Integer> setlist = new HashSet<>();
		 setlist.addAll(s1);
		 
		 System.out.println("Set:" + setlist);
		
		
	}

}
