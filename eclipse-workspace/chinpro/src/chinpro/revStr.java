package chinpro;

public class revStr {
	public static void main(String[] args) {
		//reverse string or word
		String s1 = "Ruchika";
//		char[] s2 = s1.toCharArray();
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
		// word to word reverse sentence
		System.out.println();
		System.out.println("***********************************");
		String str = "Ruchika is Topper";
		char[] str1 = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str1[i]);
		}
		System.out.println();
		System.out.println("***********************************");
		//reverse sentence
		String str3 = "Ruchika Is Topper";
		String[] str4=str3.split(" ");
		System.out.println(str4[0]);
		String temp = "";
		for(int i = str4.length-1; i>=0;i--) {
			temp = temp +" "+str4[i];
		}
		System.out.print(temp);
		System.out.println();
		System.out.println("***********************************");

	}
}
