package chinpro;

public class palindromprac {
public static void main(String[] args) {
	int  num=121,rev =0,temp=num; 
	for(;num!=0;) {
		rev = rev*10+ num%10;
	num=num/10;
	}
	System.out.println(rev);
	
	
	if(temp==rev) {
		System.out.println("This us palindrome number");
	}else {
		System.out.println("This is not palindrome number");
	}
	
}
}


