package typeCastingUP;
class Pune{
	void Deccan() {
		System.out.println("You are in Deccan");
	}
}
class Mumbai extends Pune {
	void Kurla() {
		System.out.println("You are in Kurla");
	}
}
public class ex1 extends Mumbai{
	void myCity() {
		System.out.println("You in city");
	}
	public static void main(String[] args) {
		
		ex1 u1=new ex1();
		Mumbai m1=new ex1();//auto upcasting or implicit upcasting
		Mumbai m2=u1;//auto upcasting or implicit upcasting
		Pune p1=new ex1();//auto upcasting or implicit upcasting
		Pune p2=u1;//auto upcasting or implicit upcasting
		
		Mumbai m3=(Mumbai)new ex1();//explicit upcasting
		Mumbai m4=(Mumbai)u1;//explicit upcasting
		Pune p3=(Pune) new ex1();//explicit upcasting
		Pune p4=(Pune)u1;//explicit upcasting
		
		
		Pune p5=new Mumbai();//implicit upcasting
		Pune p6=(Pune)new Mumbai();//explicit upcasting
	}

}