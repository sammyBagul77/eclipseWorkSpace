package asgn2;

public class Negint {
public static void main(String[] args) {
	int num = -12;
	for(int i = -1; i>=num;i--) {
	if(num%i==0) {
		System.out.println("Facotor of " + num +": " + i);
}
	}
}
}