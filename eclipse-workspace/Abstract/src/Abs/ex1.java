package Abs;
// 100% Abstract method 
abstract class Animal{
  abstract protected void name();
  abstract void voice();
}

class dog extends Animal{
	public void name() {
		System.out.println("Name of Animal is Dog");
	}
	void voice() {
		System.out.println("Dog can bark");
	}
	
}
class cat extends Animal{
	public void name() {
		System.out.println("Name of Animal is cat");
	}
	void voice() {
		System.out.println("meaw meaw");
	}
	
}

public class ex1 {
public static void main(String[] args) {
	//Animal A1 = new Animal();--->Can't create object of Abstract class

		dog d =new dog();
		d.name();
		d.voice();
		
	cat c = new cat ();
	c.name();
	c.voice();
}
	
}
