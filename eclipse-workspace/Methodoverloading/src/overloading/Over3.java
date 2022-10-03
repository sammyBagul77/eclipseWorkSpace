package overloading;

public class Over3 {

	public void add(int x, int y) {
		int result = x+y;
		System.out.println("The addition of two Numbers: " + result);
	}
	public void add(int x,float y) {
		float result = x+y;
		System.out.println("The addition of two Numbers using one float: " + result);
		}
	
	public static void main(String[] args) {
		Over3 var1 = new Over3();
		var1.add(4, 12.3f);
		var1.add(3,4);
       Over2.Square(4);
	}
}
