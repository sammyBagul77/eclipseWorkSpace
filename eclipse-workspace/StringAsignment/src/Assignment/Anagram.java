package Assignment;

import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		String s = "Samarth ";
		String s1 = "rth amas";

		s = s.toLowerCase();
		s1 = s1.toLowerCase();

		System.out.println(s);
		System.out.println(s1);
System.out.println("**********************************************");
		if (s.length() == s1.length()) {
			char[] arr1 = s.toCharArray();
			char[] arr2 = s1.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			System.out.println(arr1);
			System.out.println(arr2);
			System.out.println("**********************************************");

			boolean result = Arrays.equals(arr1, arr2);
			if (result == true) {
				System.out.println("Anagram Strings");
			} else {
				System.out.println("Not Anagram Strings");
			}

		}
	}
}