package org.sample;

import java.util.Scanner;

public class GetemailId {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Email:");
		String email = s.nextLine();

		if (email.contains("@")) {
			System.out.println("Valid Email Id!!!");
		} else {
			System.out.println("Email is not Valid!!!");
		}

	}
}
