package org.sample;

import java.util.Scanner;

public class GetAddress {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Address:");
		String address = s.nextLine();

		if (address.contains("pincode")) {
			String modifiedaddress = address.replace("pincode"," ");
			System.out.println("Modified Address : "+ modifiedaddress);
		} else {
			System.out.println("Include Pincode");
		}
	}

}
