package taskDay5;

public class Replacevowels {
	public static void main(String[] args) {
		// Given string
		String str = "Welcome to Java";

		// Replace vowels with '@'
		String replacedString = replaceVowelsWithAt(str);

		// Print the replaced string
		System.out.println("Replaced string: " + replacedString);
	}

	public static String replaceVowelsWithAt(String str) {
		// Create a StringBuilder to build the replaced string
		StringBuilder sb = new StringBuilder();

		// Loop through each character of the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// If the character is a vowel, replace it with '@', otherwise keep the
			// character as it is
			if (isVowel(ch)) {
				sb.append('@');
			} else {
				sb.append(ch);
			}
		}

		// Convert the StringBuilder to a string and return
		return sb.toString();
	}

	public static boolean isVowel(char ch) {
		// Check if the character is a vowel (both uppercase and lowercase)
		return "AEIOUaeiou".indexOf(ch) != -1;
	}
}
