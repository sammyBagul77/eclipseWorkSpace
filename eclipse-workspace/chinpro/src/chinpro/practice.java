package chinpro;
class parent{
	parent(int i){
		System.out.println("I am parent const");
	}
	int var =12;
	void method1() {
		System.out.println("I am method from parent class");
	}
	
}
class child1 extends parent{
	child1(){
       super(12);
		System.out.println("I am child1const");
	}
	int va1 =13;
	void method1(int i) {
		super.method1();
		System.out.println("I am method from child1 class");
		int a =i++;
	}
	
}
class child2 extends child1{
	child2(){
		System.out.println("I am child2 const");
	}
	
	void method1() {
		System.out.println("I am method from child2 class");
	}
	
}
public class practice {
public static void main(String[] args) {
	child2 c2 = new child2();
	c2.method1();
	parent p1 = new child2();//-> upcasting
	p1.method1();
	System.out.println(p1.var);
	System.out.println("*********************************");
//	child2 c1 = (child2)p1;
//	c1.method1();
//	System.out.println(c1.var);
//	System.out.println(c1.va1);
}
}
