package asgn2;

public class plnum {

	public static void main(String[] args) {
    int num=1221,rev=0,temp;
    temp =num;
    for(; num>0;) {
    	 rev = rev *10+ num%10;
    			num= num/10;
    			
    }
    System.out.println(rev);

    if(temp == rev) {
    	System.out.println("This is palindrome number");
    }
    else {
    	System.out.println("This is  not palindrome number");
    }
	}

}
