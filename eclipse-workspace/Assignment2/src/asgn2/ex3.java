package asgn2;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
	void display() {
		System.out.println("I am display() of Animal2 class");
	}
}
class Dog2 extends Animal2 {
	public void move() {
		 Animal2 a1 = new Animal2();//instance of Animal2 class
//		 a1.move();
//		super.move(); 
		System.out.println("Dogs can walk and run");
		display();
//		super.move(); 
	}
}
public class ex3 {

	public static void main(String args[]) {
		Animal2 b = new Dog2(); 
		b.move(); 
	}
}