package asgn2;

import java.util.Scanner;

// Sum of n natural numbers
public class Snat {

	public static void main(String[] args) {
		int n , sum =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the the Highest n Number: ");
		n =s.nextInt();
		for(int i=0;i<=n;i++) {
    	  sum = sum +i;
			}
		System.out.println("Sum of n natural numbers: " + sum);
		
		}
	}


