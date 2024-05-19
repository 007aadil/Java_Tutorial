package taskDay5;

import java.util.Scanner;

public class VerifyPincode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Address:");
		String address = s.nextLine();

		if (address.contains("pincode")) {
			String replace = address.replace("pincode", " ");
			System.out.println("The Address is: " + replace);
		} else {
			System.out.println("Enter Valid Address");
		}
	}

}
