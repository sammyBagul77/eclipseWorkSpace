package wrapper_class;

public class example2 {
	public static void main(String[] args) {

		char c1 = 'A';

		Character charObj1 = new Character(c1);// explicit boxing
		System.out.println(c1 == charObj1);// it will compare both values
		System.out.println("**********************************");

		Character charObj2 = new Character('Z');// explicit
		Character charObj3 = 'H';// implicit boxing
		System.out.println("**********************************");

		System.out.println("c1: " + c1);
		System.out.println("charObj1: " + charObj1);
		System.out.println("charObj2: " + charObj2);
		System.out.println("charObj3: " + charObj3);
		System.out.println("**********************************");

		boolean b = (13 == 12);// declearing
		Boolean bObj = new Boolean(b);// explicit
		System.out.println(bObj == b);
		System.out.println("The result: " + b);
		System.out.println("The result: " + bObj);
	}
}
