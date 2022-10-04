package Assignment;

public class Longsub {

	public static void main(String[] args) {
		String s1 = "asfhsdfja";
		char [] s2 = s1.toCharArray();
		
		for(int i = 0; i<s2.length;i++) {
			
			for(int j=i+1; j<s2.length;j++) {
				
				if (s2[i]== s2[j]) {
					s2[j]=0;//-->it will print all sring without duplicate characters
					//s2[i]=0;//-->if we use this also then it will remove repeated character and print unique characters
				}
				
			}
			if(s2[i]!=0)
			System.out.print(s2[i]);
			
		}
		

	}

}
