package String_class;

import java.util.Scanner;

class Str {
	static String str(String st) {
		String temp = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			temp = temp + st.charAt(i);
		}
		return temp;
	}
}

public class ex3 {
	public static void main(String[] args) {
		String s = "Jalgaon";
		char c = s.charAt(5);
		System.out.println("The character at 0th place: " + c);
		System.out.println("*******************************");
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("*******************************");
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("*******************************");

		// reverse string using contact
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}
		System.out.println(temp);
		System.out.println(s);
		// passing string to method
		System.out.println("*******************************");
		
		//Giving Input from Keyboard using Scanner
		Scanner Sc =new Scanner(System.in);
		String st2;
		System.out.print("Enter The word or Sentence which do you want to Reverse: ");
		st2=Sc.nextLine();
		System.out.println(" ");
		System.out.print("Your Reverse String: ");
		System.out.println(Str.str(st2));
		
		// Logic of Plndrm String
		if(st2.equals (Str.str(st2))){
			System.out.println("This is Palindrome String");
		}
		else {
			System.out.println(" This is not Palindrome String");
		}
			
		System.out.println("*******************************");
		System.out.println(Str.str("Faispur"));

	}

}
