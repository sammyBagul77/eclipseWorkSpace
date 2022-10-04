package asgn2;

public class CoutNUsingWhile {

	public static void main(String[] args) {
	int count=0, num=156478;
while(num !=0) {
	num = num/10;
	count++;
}
System.out.println("Number Of Digits: "+count);
	}

}
