package typeCastingUP;
class Grandfather{
	void property(){
		System.out.println("This Home is my property");
	}
	void method(){
		System.out.println("This Home is my property");
	}
}
class Father extends Grandfather{
	void property(){
		System.out.println("This Car is my property");
	}
}
	class Child extends Father{
		void property(){
			System.out.println("This Bike is my property");
		
		}
}

public class ex2 {
public static void main(String[] args) {
	Grandfather g1 = new Child();//-->upcasting
	g1.property();
	Child c1 = (Child) g1;//--> Downcast
		c1.property();
		Grandfather g2 = new Father();
	g2.property();
Father f1 =(Father)g2;
f1.property();
}
}
