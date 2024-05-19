package taskDay5;

public class NonliteralString1 {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("program");
		String s3 = new String("javaprogram");

		System.out.println("Identity Hashcode of s1: " + System.identityHashCode(s1));
		System.out.println("Identity Hashcode of s2: " + System.identityHashCode(s2));
		System.out.println("Identity Hashcode of s3: " + System.identityHashCode(s3));

	}

}
