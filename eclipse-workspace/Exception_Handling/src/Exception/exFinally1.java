package Exception;

public class exFinally1 {
public static void main(String[] args) {
	

try {
	int a =24/0;
	System.out.println("This is try block");
}
catch(NullPointerException obj){//it error occurred in catch block dn also finally block will execute
	System.out.println("Exception Handled: "+ obj);
}
//executes regardless of exception occurred or not
finally {
	System.out.println("This is final block");
}
}
}

