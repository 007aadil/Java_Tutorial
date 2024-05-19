package taskDay5;

import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your String:");
		String s1 = s.nextLine();
		String string = s1.toUpperCase();	
		System.out.println("The Result String is: " + string);
	}

}
