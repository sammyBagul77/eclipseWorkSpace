package Exception;

public class exThrowExp {
public static void main(String[] args) {
	int age = 12;

		if(age<18 && age >0) {
			throw new ArithmeticException("U are not eligible for vote" );
		}
		else {System.out.println("You r eligible for vote");}	

}
}