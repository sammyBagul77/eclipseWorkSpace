package wrapper_class;

public class example1 {
	public static void main(String[] args) {
		int a = 25;
		System.out.println("declearing var: " + a);
		System.out.println("*********************************");
		
		Integer val = a;// implicit boxing/auto boxing
		System.out.println("calling var implicitly: " + val);
		System.out.println("*********************************");
		
		Integer val2 = new Integer(23);// explicit boxing
		System.out.println("calling var explicitly: " + val2);
		System.out.println("*********************************");
		
		// checking values by'==" 
		System.out.println("a== val: "+ (a==val));
		System.out.println("val ==val2: "+ (val==val2));
		
	}

}
