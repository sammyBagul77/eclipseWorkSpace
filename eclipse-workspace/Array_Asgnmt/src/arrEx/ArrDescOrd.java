package arrEx;

import java.util.Arrays;
public class ArrDescOrd {
 public static void main(String[] args) {
	int [] var = {12,4,8,16,10};
	Arrays.sort(var);
//	System.out.println("Arranging above array in Ascending Order");
	for(int v: var) {
//		System.out.print(v+" ");
	}
	System.out.println(" ");
	System.out.println("Arranging above array in Descending Order");
	for(int i =var.length-1;i>= 0;i--) {
		System.out.print(var[i]+" ");
	}
}
 
}