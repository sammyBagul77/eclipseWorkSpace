package megaPractice;
class nw{
	static float var1=1200.0f;
	int  var2=12 ;
	{
		System.out.println("This is non static block");
		float vr2 =  var2;
		if(nw.var1% vr2 == 0 ) {
			System.out.println("var1 is completely divisible by var 2 ");
		}
		else {
			System.out.println("var1 isn't completely divisible by var 2 ");
		}
	}
	static void cal (float s, int emp) {
		var1 =s;
	nw w2 = new nw();
	w2.var2 =emp;
		System.out.println("var1 is Salary: " + var1);
	System.out.println("Var2 is rollno: " + w2. var2);
	}
	public static void main(String[] args) {
		System.out.println("I am main method");
		Ex1 e1 =new Ex1();
		e1.main(45, 13);
      
		cal(12000.0f,33);
			}
	}

public class Ex1 {
int a =12, b =13;
static int c =12 ,d =13;
	static {
		Ex1 n1 = new Ex1(); 
		   System.out.println("The addition of non- stat var :  " +(n1.a +n1.b));
       n1.a=20;
       System.out.println("The new value of non stat var a : " + n1.a);
	}
	
	void main(int a, int b) {
		//Re-inatializing the val of stat var c
		Ex1.c =a;
		System.out.println(" The new value of c: " + Ex1.c);
		}
	

}
