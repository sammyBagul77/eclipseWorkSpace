package chinpro;

public class pattern1 {
public static void main(String[] args) {
	
	int num=6;
	
	for (int i=1; i<=num;i++) {
		for(int j =1;j<=i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	System.out.println("*******************************");
	
	for(int i=0;i<=6;i++) {
		for(int j=6;j>=i;j--) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	System.out.println("*******************************");
	for(int i =6; i>=0;i--) {
		for(int j =i;j>0;j--) {
			System.out.print("*"+" ");
		}
	System.out.println();
	for(int j =i;j>0;j--) {
		System.out.print(" ");
	}
}

}
}