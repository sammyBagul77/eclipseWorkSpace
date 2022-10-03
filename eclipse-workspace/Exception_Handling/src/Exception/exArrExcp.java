package Exception;

import java.util.Scanner;

public class exArrExcp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array:");
	int  size = sc.nextInt();
	int[] arr = new int[size];
	
	try {
		arr[3]=11;
		System.out.println("YOU ARE INSIDE THE TRY BLOCK");
		System.out.println("arr[3]: " + arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException e) {// if we don't know the type of exception dn wil write catch(Throwable odj)also.
		System.out.println("This is catch block");
		//System.out.println("Exception object: " + e);
		//e.printStackTrace();
		System.out.println("Get message: "+e.getMessage());//it will provide msg shortly
		System.out.println("Block ends here");
	}
	System.out.println("Program ends here");
	}

}
