package Exception;

class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
		super(str);
	}
}

public class ex_throws3 {
	public static void validAge(int age)throws UserDefinedException{
		if(age<18) {
			throw new UserDefinedException("Person is not eligible to vote");
		}
		else {
			System.out.println("U r eligible for vote");
		}
	}
	
	public static void main(String[] args) {
try {
	validAge(1);
	
} catch (UserDefinedException e) {
	e.printStackTrace();
}		
	}

}
