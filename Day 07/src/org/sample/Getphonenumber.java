package org.sample;

import java.util.Scanner;

public class Getphonenumber {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Phone Number:");
		String next = s.next();

		String alpha = "";
		String num = "";
		String other = "";

		for (int i = 0; i < next.length(); i++) {
			char c = next.charAt(i);
			if (Character.isAlphabetic(c)) {
				alpha = alpha + c;
			} else if (Character.isDigit(c)) {

				num = num + c;
			} else {
				other = other + c;
			}

		}

		System.out.println("Alphapet : " + alpha);
		int parseInt = Integer.parseInt(num);
		System.out.println("Number : "+ parseInt);
		System.out.println("Special Characters : " + other);

	}

}
