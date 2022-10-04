package asgn2;

public class PalinNumUsingWhile {
public static void main(String[] args) {
	int rev =0, num=123,temp=num;
	while(num!=0) {
		rev =rev*10+num%10;
				num= num/10;
	}
	if(rev == temp) {
		System.out.println("This is palindrome number");
	}
	else {
		System.out.println("This is not palindrome number");
	}
}
}
