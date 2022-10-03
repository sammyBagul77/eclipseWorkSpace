package asgn2;

public class primeNusingWhile {
public static void main(String[] args) {
	int num =1,i=1,count =0;
 if(!(num==0 || num ==1)) {
	 while(i<=num){
		
		if (num%i == 0) {
		 count++;}
		 i++;
	 }
	 if(count==2) {
			System.out.println("prime number: " + num);
		}
		else {
			System.out.println("It is not  prime number");
		}
 }
 else {
		System.out.println("not prime  nor composite");
	}
}
}
