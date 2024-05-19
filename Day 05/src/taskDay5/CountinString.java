package taskDay5;

public class CountinString {
	public static void main(String[] args) {
		// Given string
		String s1 = "Welcome To Java class @123";

		// Initialize counters for uppercase letters, lowercase letters, digits, and
		// special characters
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		// Loop through each character of the string
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			// Check character type and increment corresponding counter
			if (Character.isUpperCase(ch)) {
				uppercaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowercaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println("Uppercase letters count: " + uppercaseCount);
		System.out.println("Lowercase letters count: " + lowercaseCount);
		System.out.println("Digits count: " + digitCount);
		System.out.println("Special characters count: " + specialCharCount);
	}

}
