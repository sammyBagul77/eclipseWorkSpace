package chinpro;

public class immuMu {
	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(s1);
		String s3 = s1.concat(" Java");
		System.out.println(s1);
		System.out.println(s3);

		// String Buffer
		StringBuffer s2 = new StringBuffer("Ruchika ");
		s2.append("is Topper");
		System.out.println(s2);
		
	
	}
}
