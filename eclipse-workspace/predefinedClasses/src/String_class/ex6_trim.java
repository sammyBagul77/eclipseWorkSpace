package String_class;

public class ex6_trim {
	public static void main(String[] args) {

		String S = "          Delhi   ";
		System.out.println(S.length());
		System.out.println(S.trim().length());// it will remove front,Back Spaces only
		System.out.println("***************************************");
		String st ="I   Am       QA        ";
		System.out.println(st.length());
		System.out.println(st.trim().length());
	}

}
