package Exception;

public class exThrow2 {
	public static void validate(int age) {
		if (age < 18 && age > 1) {
			throw new ArithmeticException("U are not eligible for vote");
		} else if(age>= 18) {
			System.out.println("You r eligible for vote");
		}
	}

	public static void main(String[] args) {

		try {
			validate(2);
		} catch (ArithmeticException obj) {
			System.out.println("Exception Handled: "+ obj);

		}
	}
}
