package SystemClass;
class training{
	training(){
		System.out.println("training class Const");
	}
	void manualtest() {
		System.out.println("I am from manual testing training");
	}
	void automationtest() {
		System.out.println("I am from automation testing training");
		//classname.Finalstaticvar.non-static method
	}
	
}

public class SystemRef {
final static training t1 =new training();
	public static void main(String[] args) {
//	training t = new training();
//	t.automationtest();
//	t.manualtest();
	System.out.println("********************************************");
	//calling non static methods by using System Reference
	SystemRef.t1.automationtest();
	SystemRef.t1.manualtest();
	//classname.Finalstaticvar.non-static method
	}

}
