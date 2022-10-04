package keyword;

public class Ex6 {
int a =12;
static int b =4;

    Ex6(int a,int b)
    { 
    	
    	System.out.println(" The val of local var : " + a);
    	System.out.println(" The val of Global var : " + this.a);
	this.a  = a;
    	System.out.println(" The val of Global var : " + this.a);
    	Ex6.b =b;
    	System.out.println(" The val of Global var : " + Ex6.b);
    }
	public static void main(String[] args) {
		Ex6 e = new Ex6(30,56);
		System.out.println(e.a);
	}

}
