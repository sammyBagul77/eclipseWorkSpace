package asgn2;

public class rev_val {

	public static void main(String[] args) {
	
		int num=120,res=0;
		for(;num!=0; ) {
			int x =num%10;
			res = res*10+x;
			num =num/10;
			System.out.print("Reverse of a number is =  "+res);
		}
		System.out.println("Reverse of a number is =  "+res);
		
	}
}
