package taskDay5;

import java.util.Scanner;

public class UpperLower {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String op1 = convertLetters(input);

		System.out.println("Input = " + input);
		System.out.println("Output = " + op1);
	}

	public static String convertLetters(String input) {
		StringBuilder op = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isLowerCase(currentChar)) {
				op.append(Character.toUpperCase(currentChar));
			} else if (Character.isUpperCase(currentChar)) {
				op.append(Character.toLowerCase(currentChar));
			} else {
				op.append(currentChar); // Keep non-alphabetic characters unchanged
			}
		}

		return op.toString();
	}
}
