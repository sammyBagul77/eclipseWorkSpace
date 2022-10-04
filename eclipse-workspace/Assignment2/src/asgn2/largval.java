package asgn2;

public class largval {
	public static int la(int a, int b, int c) {
		if(a>b &&a>c) {
			System.out.println("large number: " +a);
		}
		else if( a<b && c<b) {
			System.out.println("large number: " + b);
		}
		else if(b<c && a<c) {
			System.out.println("large number:" + c);
		}
		else {
			System.out.println("All numbers are equal");
		}

		return 0;
	}
	public static void main(String[] args) {
	la(1,0,0);
	}
	}
	
