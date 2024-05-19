package taskDay5;

import java.util.Scanner;

public class Gmail {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Email:");
		String email = s.nextLine();

		if (email.contains("gmail")) {
			String replace = email.replace("gmail", "yahoo");
			System.out.println("The Email ID:" + replace);
		}
		else {
			System.out.println("Enter Valid EmailId!!!");
		}

	}

}
