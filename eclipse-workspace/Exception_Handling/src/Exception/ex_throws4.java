package Exception;

class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
		super(str);
	}
}

public class ex_throws4 {
	public static void validAge(int age){
	
		if(age<18) {
			try {
			throw new UserDefinedException("Person is not eligible to vote");
			}catch (UserDefinedException e) {
				e.printStackTrace();
			}	
		}
		else {
			System.out.println("U r eligible for vote");
		}
			
	}
	
	public static void main(String[] args) {
	validAge(1);
}
}