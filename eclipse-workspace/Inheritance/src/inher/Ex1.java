package inher;

class A{
	static int a =12;
     float f =13.4f;
     char ch = 'R';
}

class B extends A{
	static int b =14;
    float f1 =16.4f;
    char ch1 = 'J';
}

class C extends B{
	static int c =16;
    float f2 =19.4f;
    char ch2 = 'N';
}
public class Ex1 {
     public static void main(String[] args) {
    	 // Access of method static var
		System.out.println("the val of static var a: " + A.a);
		System.out.println("the val of static var b: " + B.b);
		System.out.println("the val of static var c: " + C.c);
	// Access of non - static var using inherit from C class
		System.out.println("*************************************" );
		C e1 = new C();
		System.out.println("the val of static var f:" + e1.f);
		System.out.println("the val of static var ch:" + e1.ch);
		System.out.println("the val of static var f1:" +e1.f1);
		System.out.println("the val of static var ch1:" + e1.ch1);
		System.out.println("the val of static var f2:" + e1.f2);
		System.out.println("the val of static var ch2:" + e1.ch2);
		// Access of non - static var using inherit from B class	
		System.out.println("*************************************" );
		B e2 = new B();
		System.out.println("the val of static var f:" + e2.f);
		System.out.println("the val of static var ch:" + e2.ch);
		System.out.println("the val of static var f1:" +e2.f1);
		System.out.println("the val of static var ch1:" + e2.ch1);

	}
}
