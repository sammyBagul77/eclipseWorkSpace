package chinpro;

public class vowel {
	public static void main(String[] args) {
		String str = "Welcome";
		int count = 0;
		str.toLowerCase();
		char[] str2 = str.toCharArray();
		for (int i = 0; i < str2.length; i++) {
			if (str2[i] == 'a' || str2[i] == 'e' || str2[i] == 'i' || str2[i] == 'o' || str2[i] == 'u') {
				System.out.print(str2[i] + " ");
				count++;
			}

		}
		
		System.out.println();
		System.out.println("Total number vowels present in the string:"+count);

	}
}