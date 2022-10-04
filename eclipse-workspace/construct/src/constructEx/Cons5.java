package constructEx;

class Ex{
	double i;
	// Ini globle var using const
	Ex(double j){
		System.out.println("This is const Ex");
		i =j;
		//System.out.println(i);
	}
}


public class Cons5 {

	public static void main(String[] args) {
	Ex x = new Ex(13.14);
	System.out.println("The value of i in cons : " + x.i);
	// Reinatializing the value of i
	System.out.println("***************************************** ");
    Ex x1 =new Ex(12.9);
    System.out.println("The value of i in cons : " + x1.i);
	}

}
