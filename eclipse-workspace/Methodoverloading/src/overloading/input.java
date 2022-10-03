package overloading;
import java.util.*;
class input{
	public static void main(String[] args) {
		int age;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = S.nextInt();
		if(age >=18 && age <=100  ) {
			System.out.println("You are adult");
		}
	if(age < 18 && age >0 ){
		System.out.println("You are minor");
	}
			else {
			System.out.println("Enter your valid age");
		}

}
}