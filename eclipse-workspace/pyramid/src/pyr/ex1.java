package pyr;

public class ex1 {
public static void main(String[] args) {

		for(int i=7;i>0;i--) {
			for(int j=1;j<=i;j++) {//define patterns
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {//define patterns
				System.out.print("* ");
			}
			System.out.println();
		}		
}
}

