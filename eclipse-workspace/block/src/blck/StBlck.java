package blck;


public class StBlck {
 
	static {
		System.out.println("This is Static block");
	}
	
	public static void main(String[] args) {
		StBlck k = new StBlck(); 
		System.out.println("THis is main() method");
		}
	
	{
		System.out.println("This is non-Static block");
	}
}
