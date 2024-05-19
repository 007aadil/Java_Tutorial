package taskDay5;

import java.util.Scanner;

public class EndsWith {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your String:");
		String s1 = s.nextLine();
		String l = s1.toLowerCase();

		if (l.endsWith("class")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
