package inher;

class A2 {
	A2(int i) {
		System.out.println("Hello");
	}
}
class B2 extends A2 {
	//super statement
	B2() {
		super(12);
		System.out.println("Welcome");
	}
}

//public class Ex3 extends A2,B2 {--> will create confusion multiple inheratance is not possible
public class Ex3 extends B2{

	public static void main(String[] args) {
	B2 e1 =new B2();
		
	}
}
