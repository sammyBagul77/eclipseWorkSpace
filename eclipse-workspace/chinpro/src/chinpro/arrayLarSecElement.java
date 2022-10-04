package chinpro;

import java.util.Arrays;
//second largest element
public class arrayLarSecElement {
public static void main(String[] args) {
	int a =12,num =1;
	for (int i =1;i<=a;i++) {
		num =i*(num);
		
	}
	
	System.out.println("Factorial of " +a + ": "+num);
}
}
