package org.sample;

import java.util.Scanner;

public class UserDefineSet {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = s.nextLine();
		System.out.println("Enter Your ID:");
		short id = s.nextShort();
		System.out.println("Enter Your Phonenumber:");
		int phonenumber = s.nextInt();
		System.out.println("Enter your Date of Birth");
		String dob = s.nextLine();
		System.out.println("Enter your Date of Joining");
		String doj = s.nextLine();
		System.out.println("Enter Your Email:");
		String email = s.nextLine();
		System.out.println("Enter Your Gender:");
		String gender = s.next();
		System.out.println("Enter Your Salary:");
		float salary = s.nextFloat();
		
		
	}

}
