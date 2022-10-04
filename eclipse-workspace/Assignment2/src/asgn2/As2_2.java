package asgn2;
import java.util.Scanner;
public class As2_2 {
	public static void main(String[] args) {
double a, b;
char c = '/';
Scanner r =new Scanner(System.in);
System.out.println("Enter the value for variable A: ");
a =r.nextDouble();
System.out.println("Enter the value for variable A: ");
b =r.nextDouble();

System.out.println("**************************************");
System.out.println("The value for variable A: " + a);
System.out.println("The value for variable B: " + b);
System.out.println("**************************************");
switch(c) {
case '+' :
	System.out.println("Sum of above variables " +(a+b));
	break;
case '-' :
	System.out.println("Subtraction of above variables " +(a-b));
	break;
case '*' :
	System.out.println("Multiplication of above variables " +(a*b));
	break;
case '/' :
	System.out.println("Division of above variables " +(a/b));
	break;
}

}
}