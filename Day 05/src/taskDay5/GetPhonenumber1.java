package taskDay5;

import java.util.Scanner;

public class GetPhonenumber1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Phone Number:");
		String next = s.next();

		if (next.length() > 10) {
			System.out.println("Invalid number!!!");
		} else {
			System.out.println("Valid number!!!");
		}

	}

}
