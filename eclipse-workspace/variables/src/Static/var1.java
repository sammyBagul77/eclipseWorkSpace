package Static;

 public class var1 {
	static int a;
	static float b;

	public static void main(String[] args) {
	// below result will show only default value because we are only declearing static globle variable here.
		System.out.println(a);
		System.out.println(b);
		System.out.println("*********************************************");
	
		a =13; //- not changing the value of b
		System.out.println("The value of a: " + a);
		System.out.println("The value of a + b: "+ (a+b));
		System.out.println("*********************************************");
 // Now changing the value of b . from here the value of a is permanently
		b= 16.3f;
		System.out.println("The value of a +b after changing b's value: "+(a+b));
		System.out.println("*********************************************");
// Accessing Static variable by using class reference.
		System.out.println("The value of a is " +var1.a);
		System.out.println("The value of b is " +var1.b);
	}

	
}
