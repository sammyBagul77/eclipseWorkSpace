package chinpro;

public class practString {
 public static void main(String[] args) {
	String s1 = "jalgaon";
	String s2 = "Java Program";
	String s3 =new String("jalgaon");
	String s4 = s2;
	String s5="jalgaon";
	String s6 = new String("jalgaon");
	System.out.println(s1.equals(s3));//true--> compare values
	System.out.println(s2.equals(s4));//true--> compare values
	System.out.println(s3==s1);//false--> compare address
	System.out.println(s2==s4);//true---> compare address
	System.out.println(s1==s5);//true--->it will  point same object coz it will store in literal(String constant pool)
	System.out.println(s3==s6);//false--> because it will store value in non constant area

}
}
