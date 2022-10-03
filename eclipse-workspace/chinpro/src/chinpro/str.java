package chinpro;

import java.util.Scanner;

public class str {
	public static void main(String[] args) {
	char c;
	String s1;
	String s2;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the char: " );
c = sc.next().charAt(0);
System.out.println(c);
System.out.println("**************************");
System.out.println("Enter the String: " );
s1= sc.next();
System.out.println(s1);
System.out.println("********************************");

sc.nextLine();//--> if we r not write this method here then it will not take another string as input
 System.out.println("the value of s2: ");
 s2=sc.next();
 System.out.println(s2);


	}
}