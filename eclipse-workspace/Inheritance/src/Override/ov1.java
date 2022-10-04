package Override;

class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}
public class ov1 {

	public static void main(String[] args) {
		
		Parent obj1 = new Parent();
		obj1.show();
		//Parent's show()
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();//Child's show()

	}

}
