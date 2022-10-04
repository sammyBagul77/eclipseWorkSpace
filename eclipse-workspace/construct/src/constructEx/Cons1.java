package constructEx;

public class Cons1 {
int a =12;
int b= 14;
// This is non - params constructor
  Cons1(){
	  System.out.println("I am non params constructor");
  }
  // This is params constructor
  Cons1(int a){
	  System.out.println("I am params constructor");
  }
	public static void main(String[] args) {
		Cons1 c = new Cons1();
		System.out.println(c.a);
		System.out.println(c.b);
		// -> will gives the error.. coz we have to create obj for params cons also  Cons(12);
		Cons1 m = new Cons1(12);
		//if we want to access non static varibles
		m.a =13;
		System.out.println(m.a);
		System.out.println(c.a);
	}

}
