package keyword;

public class Ex5 {
   int cube(final int n) {
	 int  res =n*n*n;
	   System.out.println("The current val of n : " + n);
	  // n =n+2;
	   return res;
   }
   
	 public static void main(String[] args) {
		Ex5 e1 = new Ex5();
		System.out.println("The cube of n is " + e1.cube(12));
	}
   
}

