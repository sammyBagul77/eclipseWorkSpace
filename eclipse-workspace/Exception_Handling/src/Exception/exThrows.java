package Exception;

public class exThrows {
	
	public static int div(int a,int b) throws ArithmeticException {
		int d = a/b;
		return d;
		
	}
	
	public static void main(String[] args) {
		try {
			int res =div(12,0);
			System.out.println("result: " +res );
		}
	catch(ArithmeticException e){
			System.out.println("Exception");
			
		}
	}

}
