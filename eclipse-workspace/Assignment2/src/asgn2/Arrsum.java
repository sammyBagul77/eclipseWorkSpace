package asgn2;

public class Arrsum {
public static void main(String[] args) {
	int[] val= {1,2,3,4,5,6,7,8,9,10};
	int sum =0;
	for(int i =0;i<val.length; i++){
	sum =sum+val[i];
	}
	System.out.println("The sum of given array: " +sum);
}
}
