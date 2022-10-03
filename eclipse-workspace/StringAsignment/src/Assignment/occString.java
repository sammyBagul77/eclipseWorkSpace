package Assignment;

public class occString {
public static void main(String[] args) {
	
String s1 = "Java Program Java language";
	char [] s2 =s1.toCharArray();
	int count =1;
	 
	for(int i =0 ; i<s2.length;i++) {
		count =1;
		for(int j=i+1; j<s2.length;j++) {
			if(s2[i]==s2[j] && s2[i]!=' '){
			count ++;
			s2[j]='0';
				
			}
		}
		if(count>0 && s2[i]!='0' && s2 [i]!=' ') {
			System.out.println(s2[i]+":"+count);
		}
	}


	}
}
