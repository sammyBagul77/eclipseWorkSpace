package overloading;
import java.util.*;
public class SI {
public static void getroi() {
	float p,r,t;
	Scanner Sc =new Scanner(System.in);
	System.out.println("Enter the principal amount");
	p = Sc.nextFloat();
	System.out.println("Enter the rate of interest");
	r =Sc.nextFloat();
	System.out.println("Enter the time period");
	t =Sc.nextFloat();
	System.out.println("Your principal amount: " + p);
	System.out.println("Your rate of interest: " + r);
	System.out.println(" Time period: " + t);
	float SimInt = (p*r*t/100.0f);
	System.out.println("Your SI: " + SimInt);
	float Total_amount = (SimInt+p);
	System.out.println("Your Total amount: " + Total_amount);
}
public static int getroi(float p, float r,float t) {
	float SimInt = (p*r*t/100.0f);
	System.out.println("Your SI: " + SimInt);
	float Total_amount = (SimInt+p);
	System.out.println("Your Total amount: " + Total_amount);
	return 0;
}
public static void main(String[] args) {
	//getroi();
	Scanner Sc =new Scanner(System.in);
	float p,r,t;
	System.out.println("Enter the principal amount");
	p = Sc.nextFloat();
	System.out.println("Enter the rate of interest");
	r =Sc.nextFloat();
	System.out.println("Enter the time period");
	t =Sc.nextFloat(); 
	System.out.println("Your principal amount: " + p);
	System.out.println("Your rate of interest: " + r);
	System.out.println(" Time period: " + t);
	getroi(p,r,t);
}
}
