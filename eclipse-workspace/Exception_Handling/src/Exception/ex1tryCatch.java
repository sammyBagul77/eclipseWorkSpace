package Exception;

public class ex1tryCatch {
	public static void main(String[] args) {
		int a = 14;
		int b = 0;

		try {
			int c = a / b;
			System.out.println("**********Try Block Starts***********");
			System.out.println("The val of int c: " + c);
			System.out.println("**********Try Block Ends***********");
		} catch (ArithmeticException obj) {
			System.out.println("*********You are in catch()*********");
			System.out.println("Exception handled: " + obj);// java.lang.ArithmeticException: / by zero
			//obj.printStackTrace();//complete exception detail
			System.out.println("******Exception Handled*******");
		}
		System.out.println("Programs ends here...");
	}

}
