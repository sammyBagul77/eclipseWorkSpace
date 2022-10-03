package asgn2;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
 int n;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the number :");
   n =s.nextInt();
   System.out.println("***************** Table of " + n +" *********************");
 for(int i =1; i<=10; i++) {
      System.out.println(n + " x " + i + " = " + (n*i) );
	}

}
}