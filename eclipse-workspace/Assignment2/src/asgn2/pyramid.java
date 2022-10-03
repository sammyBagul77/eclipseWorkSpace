package asgn2;

public class pyramid {

	public static void main(String[] args) {
int i =1,j =1,c=0;
while(i <=6) {

	while(j<=i) {
		
		System.out.print((char)(j+64));
	j++;
	
	}
	i++;
	c=c+j;
	c++;
	System.out.println(" ");
}
		
	}

}

