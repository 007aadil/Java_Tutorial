package taskDay5;

import java.util.Scanner;

public class ChecktEquality {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String1 :");
		String string1 = s.nextLine();
		System.out.println("Enter the string2 :");
		String string2 = s.nextLine();

		if (string1.equals(string2)) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are not equal");
		}
	}
}
