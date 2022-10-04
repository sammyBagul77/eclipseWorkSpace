package chinpro;
class Aa{
	int var1 =12;
	Aa(){
		this(12);
		System.out.println("I am const Aa");
	}
	
	Aa(int a){
		System.out.println("I am const Aa with params");
	}
	void method(){
		this.method(12);
		int var1 =70;
		System.out.println("the value of local var: " + var1);
		System.out.println("the value of global var: " + this.var1);
		this.var1 = var1;
		System.out.println("the value of global var: " + this.var1);
	
	}
	
	void method(int i) {
		System.out.println(" I am params method");
		
	}
}


public class ex1 {
public static void main(String[] args) {
	Aa a1 =new Aa();
	a1.method();
	
}
}
