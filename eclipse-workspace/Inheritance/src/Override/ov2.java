package Override;
class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
public class ov2 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		ov2 obj = new ov2();
		obj.myMethod();
		ABC a1 = new ov2();
		a1.myMethod();
		
	}
}
