package Assignment;
public class countNumString {
public static void main(String[] args) {
	String s1 ="hey12345323hey";
	int count =0;
	char [] s2 = s1.toCharArray();
	for(char a: s2) {
	if(a>=48 && a<=57) {
		count++;
	}
	
	}System.out.println("Total Numbers present in above String: "+ count);
}
}
