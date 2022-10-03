package op;

public class UreOp1 {
	public static void main (String[] args) {
		int a = 12;
		int g = a--;
		//System.out.println(--a);
		//System.out.println(a);
		//System.out.println(a--);  //--> 10
		//System.out.println(--a); //-->9
			System.out.println(g); //12 -1
			System.out.println(a); //11
			System.out.println(--a);//10
			System.out.println(--a);//9
			System.out.println(--g);//11
			System.out.println(--a);//8
			System.out.println(g);//11
			System.out.println(a);//8 
			System.out.println(--a);
			System.out.println(--a);
			System.out.println(--g);
			System.out.println(--a);
}
}
