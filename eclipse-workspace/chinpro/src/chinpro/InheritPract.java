package chinpro;

class A {
		int num =46;
	A(int n) {
		System.out.println("I am const A");
	}

	void Aa(int a, int b) {
		int c = a + b;
		System.out.println("The addition of these two numbers: " + c);
	}

}

class B extends A {
	B(int s) {
		super(1);
		System.out.println("I am const B");
		int nw1 =super.num;
		System.out.println(nw1);
	}

	void Bb(int a, int b) {
		int mul = a * b;
		System.out.println("The Multiplication of these two numbers: " + mul);
		super.Aa(12, 13);
		int nw =super.num;
		System.out.println(nw);
	}
}
	class C extends B{
		C() {
			super(12);
			System.out.println("I am const C");
		}

		void Cc(int a, int b) {
			int sub = a - b;
			System.out.println("The division of these two numbers: " + sub);
		}
	}
public class InheritPract{
public static void main(String[] args) {
	C c1 =new C();//homo
	
	c1.Bb(1, 12);
	c1.Cc(23, 12);
}
}
