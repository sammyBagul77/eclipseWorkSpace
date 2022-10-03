package String_class;

public class ex8 {
	public static void main(String[] args) {
		String S ="i am Manish";
		String temp =" ";
		String[] s1= S.split(" ");
		for(int i = s1.length-1; i >=0;i--){
		temp =temp+" "+s1[i];
		}
		System.out.println(temp);
		System.out.println("***************");
		
		
		String str="abc";
		  System.out.println(str);
		  for (int i=str.length()-1;i>=0;i--){  
		   System.out.print(str.charAt(i));
		}
		
	}
	        
	}
