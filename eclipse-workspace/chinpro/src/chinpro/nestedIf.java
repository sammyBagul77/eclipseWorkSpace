package chinpro;

public class nestedIf {

	public static void main(String[] args) {
		int i =45;
		
		if(i>=35) {
			if(i<55) {
				System.out.println("pass");
			}
			if(i>=55 && i<=65) {
				System.out.println("second class");
			}else {
				System.out.println("First class");
			}
		}else {
			System.out.println("Fail");
		}
	}

}
