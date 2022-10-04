package Static;
// Non-Static variable Examples
public class var2 {
	static int a;
	 char c ='A';
	public static void main(String[] args) {
//creating Instance(object) :  classname refvar =new classname()
		var2 v1 =new var2();
		System.out.println(v1.a);
		System.out.println(v1.c);
		System.out.println("****************************************");
//initializing non - static variables refvar.var
		v1.a =12;
		v1.c ='H';
		System.out.println("new value of a: " + v1.a);
		System.out.println("new value of b:  "+ v1.c);
		System.out.println("****************************************");
//we can easily copy the value of non-static globle variables by creating new instance.
		var2 v2 =new var2();
		System.out.println("new value of a: " + v2.a);
		System.out.println("new value of b:  "+ v2.c);
	}

}
