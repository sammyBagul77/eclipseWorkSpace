package String_class;

public class ex2 {
	public static void main(String[] args) {
		String s1 = "Mumbai";// literal
		String s2 = "Mumbai";
		String s3 = "Banglore";
		System.out.println("Char1:" + s1);
		System.out.println("Char2:" + s2);
		System.out.println("Char3:" + s3);
		System.out.println("************************************************");
		System.out.println("counting Char1:" + s1.length());
		System.out.println("counting Char2:" + s2.length());
		System.out.println("counting Char3:" + s3.length());
		System.out.println("************************************************");
		// Equals method
		System.out.println("s1 & s2 using Equals: " + (s1.equals(s2)));
		System.out.println("s1 & s2 using ==: " + (s2 == s1));
		System.out.println("s3 & s2 using Equals: " + (s3.equals(s2)));
		System.out.println("s3 & s2 using ==: " + (s2 == s3));
		System.out.println("************************************************");
		String s4 = new String("Mumbai");// using new keyword
		System.out.println("s1 & s4 using Equals: " + (s1.equals(s4)));//equals will compare values.
		System.out.println("s1 & s4 using ==: " + (s4 == s1));//== in strings compare objects on the base of there address
		

	}
}