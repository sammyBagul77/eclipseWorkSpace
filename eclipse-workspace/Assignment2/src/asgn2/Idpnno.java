package asgn2;
import java.util.*;
public class Idpnno {
 public static void main(String[]args) {
	int a;
   Scanner s= new Scanner(System.in);
   System.out.println("Enter the number: ");
   a = s.nextInt();
   if(a >0) {
	   System.out.println("Number is positive ");
   }
   else if(a <0) {
	   System.out.println("Number is negative ");
   }
   else {
	  
		   System.out.println("Number isn't positive or negative");
	   
   }
}
}