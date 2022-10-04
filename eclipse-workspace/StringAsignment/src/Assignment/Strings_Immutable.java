package Assignment;

public class Strings_Immutable {
	static void refcheck(String x, String y) {
		if(x==y) {
			System.out.println("Both objects point to same referance ");
		}else {
			System.out.println("Both pointing to different object ");
		}
	}
	
	public static void main(String[] args) {
		
String s1 ="Race";
String s2 ="Race";
refcheck(s1,s2);
s1 =s1.concat(" Indian");
refcheck(s1,s2);
}
}