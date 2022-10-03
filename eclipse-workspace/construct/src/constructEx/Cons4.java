package constructEx;

class X{
	int  i =10;
	X(){
		System.out.println("I am const of class X");
	}
	void display(){
		System.out.println("I am display of class X");
	}
	}
class B{
	int j =20;
	B(){
		System.out.println("I am const of class B");
		}
	void display(){
		System.out.println("I am display of class A");
	}
	
}


public class Cons4 {
 public static void main(String[] args) {
	 System.out.println("Main method starts");
	X x1 = new X();
	x1.display();
	System.out.println("The non stat var in Class X : " +x1.i );
	
	B b1 = new B();
	b1.display();
	System.out.println("The non stat var in Class X : " +b1.j);
	System.out.println("Main method Ends");
}
}
