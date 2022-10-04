package Exception;

public class exampleAbnormal {
public static void main(String[] args) {
	int a=25;
//	int a/0;//ArithmeticException 
	int c =a/2;
	System.out.println("The ans of above statement: "+ c);// if ans is int then it will print value
	
	//String s= null;//NullPointerException
	String s= "STRING";
	System.out.println("The length of given String: "+ s.length());
	System.out.println("The String: "+s);
	
	int[] arr= new int[5];
	//arr[5]=13;//ArrayIndexOutOfBoundsException
	arr[3]=13;
	System.out.println("The value:"+(arr[3]));
	
	String str ="123";
	//	Integer i  = Integer.parseInt(str);//NumberFormatException
	Integer i  = Integer.parseInt(str);//this method returns the integers which are stored in the form of string
	System.out.println("The integers are "+ i);
}
}
