package String_class;

public class ex5 {
public static void main(String[] args) {
	String st ="I am Samarth. I am Living in Jalgaon. I am graduated";
	String str[]=st.split(" ");
	for(String s:str) {
		System.out.println(s);
	}
	System.out.println("***********************************");
	String str1[]=st.split("I");
	for(String s1:str1) {
		System.out.println(s1);
	}
	System.out.println("****************************************");
	String st1 ="I am Samarth. I am Living in Jalgaon. I am graduated";
	String str2[] = st1.split(" ", 6);// Above string will get divided divided into two parts.
	for(String s2: str2) {
		System.out.println(s2);
	}
	System.out.println("*************************************");
	//Reverse logic for sentence
	String Name="My Name is Samarth";
		String[] nw=Name.split(" ");	
		String temp1 ="";
	for(int i =nw.length-1;i>=0;i--) {
		temp1 =temp1+ " "+nw[i];
		}
	System.out.println(temp1);
	System.out.println("*************************************");
	//Reverse logic for character
	String Name1="My Name is Samarth";
		
	String temp2 ="";
for(int i =Name1.length()-1;i>=0;i--) {
	temp2 =temp2+Name1.charAt(i);
	}
System.out.println(temp2);
}
}
