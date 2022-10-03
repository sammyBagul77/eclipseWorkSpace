package asgn2;

public class countingDigits {

	public static void main(String[] args) {
	int count =0,n=123;
	for(;n>0; ) {
   n=n/10;
   count++; }
System.out.println(count);
}
}