package String_class;

public class ex7_concat {
public static void main(String[] args) {
	String s ="binod"+123;//--+ can join string nd number also
	System.out.println(s);
	// concat
//	String s1= s.concat(123);--> will not work..coz concat() will take only string
	String s1= s.concat("bi");
	System.out.println(s1);
	//substring
	System.out.println("****************************************");
	 s="CoreJavaBasics";
	System.out.println(s.substring(3));// It will print the characters from right from 3rd string
	System.out.println(s.substring(5, 9));
	//IndexOf
	System.out.println("****************************************");
	System.out.println(s.indexOf('B'));
	System.out.println(s.indexOf("sic"));
	System.out.println(s.indexOf("a",4));
	System.out.println(s.lastIndexOf("a"));
	System.out.println(s.lastIndexOf('a',6));
	System.out.println("****************************************");
	//upper lower
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	//replace
	System.out.println("****************************************");
	System.out.println(s.replace('a', '*'));
	System.out.println(s.replace("Java", "html"));
	//isEmpty
	System.out.println("****************************************");
	System.out.println(s.isEmpty());
	String s2 ="";
	System.out.println(s2.isEmpty());
	
}
}
