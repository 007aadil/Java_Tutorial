
package taskDay5;

public class ConsonentVowelscount {
	public static void main(String[] args) {

		// Given string
		String s1 = "Welcome";

		// Initialize counters for consonants and vowels
		int consonantsCount = 0;
		int vowelsCount = 0;

		// Convert the string to lowercase for case insensitivity
		s1 = s1.toLowerCase();

		// Loop through each character of the string
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			// Check if the character is a letter
			if (Character.isLetter(ch)) {
				// Check if the letter is a vowel
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelsCount++;
				} else {
					consonantsCount++;
				}
			}
		}

		System.out.println("Number of consonants: " + consonantsCount);
		System.out.println("Number of vowels: " + vowelsCount);
	}

}
