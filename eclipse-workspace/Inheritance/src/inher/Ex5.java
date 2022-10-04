package inher;
class fruitA {
	int fruitAge;
	fruitA() {
		System.out.println("fruitA class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

class mango extends fruitA {
	int fruitAge;
	mango() {
		// super(); //java compiler will write default super()
		System.out.println("mango class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("Mango are Tart in taste");
	}
	public void shape() {
		System.out.println("mango is round");
	}
}
public class Ex5 {

	public static void main(String[] args) {
		mango m1 = new mango();
		System.out.println(m1.fruitAge);
		m1.taste();
		m1.shape();
		System.out.println("***************************************");
		fruitA f1 =new fruitA();
		f1.taste();
		System.out.println(f1.fruitAge);
		System.out.println("***************************************");
		fruitA f2 = m1;
		f2.taste();
		System.out.println(f2.fruitAge);
		System.out.println("***************************************");
		fruitA f3 = new mango();
		f3.taste();
		System.out.println(f3.fruitAge);
		
	}

}
