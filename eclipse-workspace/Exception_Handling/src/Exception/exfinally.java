package Exception;

public class exfinally {
public static void main(String[] args) {
	finally {
		System.out.println("This is final block");//--> it will not work
	}
	try {
		int a =24/0;
		System.out.println("This is try block");
	}
	catch(Throwable obj){
		System.out.println("Exception Handled: "+ obj);
	}
//	finally {
//		System.out.println("This is final block");
//	}
}
}
/* Finally block will hit after try or catch block
* if we r using it before try block then it will not hit
*/