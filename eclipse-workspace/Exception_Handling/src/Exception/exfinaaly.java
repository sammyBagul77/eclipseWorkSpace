package Exception;

public class exfinaaly {
public static void main(String[] args) {
	try {
		System.out.println("Inside try block");
		// below code throws divide by zero exception
		int data = 25 /5;
		System.out.println(data);
		//System.exit(0);//--> if we will use this then finally block will not execute
	}
	// handles the Arithmetic Exception / Divide by zero exception
	catch (ArithmeticException e) {
		System.out.println("Exception handled");
		System.out.println(e);
	}
	// executes regardless of exception occurred or not
	finally {
		int a =25/0;
		System.out.println("finally block is always executed");
//if exception is present in finally block it will not execute
	}

	System.out.println("rest of the code...");
}
}
