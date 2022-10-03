package Assignment;
import java.util.*;
public class palinDrome_String {
public static void main(String[] args) {
	
	String s1 ="Abcdcba",s2="";
	
	String s= s1.toLowerCase();
	for(int i = s.length()-1;i>=0;i--) {
		s2 =s2 +s.charAt(i);
	}
		char [] a1 = s.toCharArray();
		char [] a2 = s2.toCharArray();
	
    if(Arrays.equals(a1, a2)) {
    	System.out.println("Given String is palindrome");
    }else {
    	System.out.println("Given String is not palindrome");
    }
}
}
