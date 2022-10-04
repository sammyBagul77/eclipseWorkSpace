package constructEx;
 public class A{
	 void m() {
		 System.out.println("I am constructor m");
	 }
	 
	 void n() {
		 System.out.println("I am cont n");
		 m();
	 } 
	
	
	}
 class ThisKeyword3 {
	 void methodOne() {
	 System.out.println("Inside Method ONE");
	 }
	 void methodTwo() {
	 System.out.println("Inside Method TWO");
	 methodOne();
	 
	 }
	 public static void main(String[] args) {
			A a1 =new A();
			a1.n();
			ThisKeyword3 b = new ThisKeyword3();
			b.methodTwo();
		} 

}
	