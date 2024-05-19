package taskDay5;

public class literalString1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "program";
		String s3 = "javaprogram";

		System.out.println("Identity Hashcode of s1: " + System.identityHashCode(s1));
		System.out.println("Identity Hashcode of s2: " + System.identityHashCode(s2));
		System.out.println("Identity Hashcode of s3: " + System.identityHashCode(s3));
	}

}
