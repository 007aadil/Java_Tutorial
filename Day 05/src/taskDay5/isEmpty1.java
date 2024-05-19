package taskDay5;

import java.util.Scanner;

public class isEmpty1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your String:");
		String s1 = s.nextLine();

		if (s1.isEmpty()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
