package asgn2;

public class primeumber {
	public static void main(String[] args) {
		int num =19, count=0;
	if(num != 0 ) {
		for(int i =1;i<=num;i++) {
			if(num%i ==0) {
			count++;
		}
		}
		if(count==2) {
		System.out.println("prime number: " + num);
	}
	else {
		System.out.println("It is not  prime number");
	}
}
	else {
		System.out.println("nor composite nor prime");
	}
}
}