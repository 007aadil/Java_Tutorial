package taskDay5;

import java.util.Scanner;

public class FindUpperandLower {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your String:");
		String s1 = s.nextLine();

		int uppercasecount = 0;
		int lowercasecount = 0;

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (Character.isUpperCase(c)) {
				uppercasecount++;
			} else if (Character.isLowerCase(c)) {
				lowercasecount++;
			}
			

		}
		System.out.println("Uppercase: " + uppercasecount);
		System.out.println("Lowercase: " + lowercasecount);
	}

}
