package chinpro;

class a1{

	static void meth(int i) {
		int a = i;
		System.out.println("a: " +a);
	}
}
class b1 extends a1{
	static void meth(int i) {
		int a = i;
		int b =a+i;
		System.out.println("b: " +b);
	}
}

public class meth {
	public static void main(String[] args) {
		
	b1  b = new b1();
	b.meth(12);
		
	  
	}

}
