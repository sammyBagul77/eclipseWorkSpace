package constructEx;

public class Cons2 {
	int roll =12;
	double salary = 50000;
	//passing global non static var to nan static method directly
	void Display(){
		System.out.println("roll No: " + roll + " " + "salary: " +salary + " using non stat method");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// calling non stat var using default const
		Cons2 c = new Cons2();
		System.out.println("************* Using default const ******************");
		System.out.println(c.roll);
		System.out.println(c.salary);
		// calling non stat var using non stat method;
		System.out.println("******************************************************************");
		c.Display();
		
	}

}
