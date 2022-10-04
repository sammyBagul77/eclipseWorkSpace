package Assignment;

public class revString {
public static void main(String[] args) {
	String s1 = "Samarth";
	
	
	for(int i = s1.length()-1;i>=0;i--) {
		System.out.print(s1.charAt(i));
	}
	System.out.println();
	String s2 = "I am Samarth";
	for(int i = s2.length()-1;i>=0;i--) {
		System.out.print(s2.charAt(i));
	}
	System.out.println();
	
	String temp = "";
	for(int i = s2.length()-1;i>=0;i--) {
		temp = temp+s2.charAt(i);
	}
	  System.out.println(temp);
	
	
//reverse sentence logic
String s3 = "I love java";
String [] nw =s3.split(" ");
String temp1 = "";

for(int i = nw.length-1;i>=0;i--) {
	temp1 = temp1+" "+nw[i];
}
  System.out.println(temp1);


}

}