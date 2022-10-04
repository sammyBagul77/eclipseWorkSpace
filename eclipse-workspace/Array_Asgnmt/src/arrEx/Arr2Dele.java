package arrEx;

import java.util.Arrays;

public class Arr2Dele {

	public static void main(String[] args) {
	int [][] var2 ={{1,2,3,4},{11,22,33},{21,22,33,12}};
	for(int i =0;i<var2.length;i++) {
		for(int j=0;j<var2[i].length;j++) {
			System.out.print( var2[i][j]+" ");
		}
		System.out.println();
		
	}
	System.out.println("*******************************");
	System.out.println("Even numbers in 2D Array");
	for(int i =0;i<var2.length;i++) {
		for(int j=0;j<var2[i].length;j++) {
			if(var2[i][j]%2==0) {
				System.out.print(var2[i][j]+" ");
			}
		}
		System.out.println();
	}
	System.out.println("*******************************");
	System.out.println("Odd numbers in 2D Array");
	for(int i =0;i<var2.length;i++) {
		for(int j=0;j<var2[i].length;j++) {
			if(var2[i][j]%2!=0) {
				System.out.print(var2[i][j]+" ");
			}
		}
		System.out.println();
	}

	}
}