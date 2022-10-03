package Override;

class Ab {
	protected void a() {
		System.out.println("This is method a");
	}

	final void b() {
		System.out.println("This is final method b");
	}
}

class Ba extends Ab {
	@Override
	public void a() {
		System.out.println("This is method ABa");
		super.a();
	}

//	void b() {
//		System.out.println("This is final method bA");
//	} ----------> Can't be override coz method b is decleared using final keyword
}

public class ov3 {
	public static void main(String[] args) {
		Ab obj = new Ab();
		obj.a();
		System.out.println("*****************************************");
		Ba obj1 =new Ba();
		obj1.a();
	}


}
