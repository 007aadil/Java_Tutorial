package taskDay5;

public class NonliteralString {
	public static void main(String[] args) {
		String s1 = new String("selenium");
		String s2 = new String("selenium");
		

		System.out.println("Identity Hashcode of s1: " + System.identityHashCode(s1));
		System.out.println("Identity Hashcode of s2: " + System.identityHashCode(s2));
		
	}

}
