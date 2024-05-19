package taskDay5;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your String 1:");
		String s1 = s.nextLine();
		System.out.println("Enter Your String 2:");
		String s2 = s.nextLine();

		int compareTo = s1.compareTo(s2);
		if (compareTo == 0) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are not equal");
		}
	}
}