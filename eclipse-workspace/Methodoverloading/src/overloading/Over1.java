package overloading;

public class Over1 {

	public static void main(String[] args) {
	 System.out.println("I am main method" );
	 main();
	}
	public static void main() {
	System.out.println("I am main()");
	Over2.Square(12.3);
}
}
