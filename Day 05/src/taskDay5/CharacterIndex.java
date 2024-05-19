package taskDay5;

public class CharacterIndex {
	public static void main(String[] args) {
		
		String s1 = "welcometojava";
		String s2 = "SeleniumAutomationtool";
		String s3 = "theatre";
		String s4 = "j a v a p r o g r a m";
		String s5 = "9876543210";
		
		 int lastIndexOf = s1.lastIndexOf('e');
		 int indexOf = s2.indexOf('m');
		 int indexOf2 = s3.indexOf('t');
		 int lastIndexOf2 = s4.lastIndexOf(" ");
		 int indexOf3 = s5.indexOf('8');
		 
		 System.out.println("welcometojava :" + lastIndexOf);
		 System.out.println("SeleniumAutomationtool :"+ indexOf);
		 System.out.println("theatre: "+ indexOf2);
		 System.out.println("j a v a p r o g r a m:"+ lastIndexOf2);
		 System.out.println("9876543210 :" + indexOf3 );
	}

}
