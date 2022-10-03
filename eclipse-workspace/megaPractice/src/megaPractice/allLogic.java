package megaPractice;

class A {
	void reverseNo() {
		int num = 123, rev = 0;
		for (; num != 0;) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse number: " + rev);
	}

	void reverseNo(int num) {
				int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Revese number: " + rev);
	}

void palindromeNo() {
		int num1 = 123, rev = 0, temp = num1;
		for (; num1 != 0;) {
			rev = rev * 10 + num1 % 10;
			num1 = num1 % 10;
		}
		if (temp == num1) {
			System.out.println("This is palindrome Number");
		} 
		else {
			System.out.println("This is not palindrome Number");
		}
	}

	void palindromeNo(int num1) {
		int rev = 0, temp = num1;
		while(num1!=0) {
			rev = rev * 10 + num1 % 10;
			num1 = num1 % 10;
		}
		if (temp == num1) {
			System.out.println("This is palindrome Number");
		} 
		else {
			System.out.println("This is not palindrome Number");
		}
	}
	void leapYr() {
		int num2 =12 ;
		if(num2%4==0 ||num2%100==0 ||num2%400==0) {
			System.out.println("This is leap year");
		}
		else {
			System.out.println("This is not leap year");
		}
	}
	void leapYr(int num2) {
			if(num2%4==0 ||num2%100==0 ||num2%400==0) {
			System.out.println("This is leap year");
		}
		else {
			System.out.println("This is not leap year");
		}
	}
}
class B extends A{
	@Override
	void reverseNo() {
		super.reverseNo();
	}
	@Override
	void reverseNo(int nu) {
		super.reverseNo(nu);
	}
		@Override
	void palindromeNo() {
		super.palindromeNo();
	}
		@Override
	void palindromeNo(int num1) {
		super.palindromeNo(num1);
	}
		@Override
	void leapYr() {
		super.leapYr();
	}
		@Override
	void leapYr(int num2) {
		super.leapYr(num2);
	}
}

public class allLogic {

	public static void main(String[] args) {
B b1 =new B();
b1.reverseNo(34);

	}

}
