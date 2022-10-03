package revision;


public class static_NonStat {
public static void main(String[] args) {
	System.out.println("This is the starting point of main method");
	
	System.out.println("This is the ending point of main method");
	static_NonStat s1= new static_NonStat();
}
static {
	int  a =100;
	int b =13;
	int c =a+b;
	System.out.println("Addition: "+ c);
}

 {
	int  a =110;
	int b =13;
	int c =a*b;
	System.out.println("Subtraction "+ c);
}

}

