package String_class;

public class ex10_StrngBuilder {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("I Am Samarth Bagul");
//		System.out.println("ReverseString: " + s.reverse());
			System.out.println("Length of String: " + s.length());//18
		System.out.println("capacity: " + s.capacity());//oldcapacity(16)+ newlength(18)=34
			s.append("I am living in Jalgaon");
		System.out.println("***********************************************");
		System.out.println("New String:" + s);
		System.out.println("Length of String: " + s.length());//old length+new length =18+22=40
		System.out.println("Capcity after update: " + s.capacity());//(old capacity*2)*2= (34*2)+2=70
		System.out.println("***********************************************");
		StringBuilder s2 = new StringBuilder();
		System.out.println("Capcity after update: " + s2.capacity());
		s2.append("I am samarth rajesh Bagul. I am living in pune");// it is already more than its old capacity so its capacity =its length
		System.out.println("Length of String: " + s2.length());
		System.out.println("Capcity after update: " + s2.capacity());
		s2.append("I am samarth rajesh Bagul. I am living in pune");
		System.out.println("Capcity after update: " + s2.capacity());//(46*2)+2 =94
		System.out.println("************************************************");
		StringBuilder sb1=new StringBuilder("Hello Java");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("Hello Java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));//address basis comparison
		System.out.println(sb1==sb2);//address basis comparison
		//We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
		//first convert StringBuffer/StringBuilder to String class using toString()
		// dn use equals() of string class
		System.out.println((sb1.toString().equals(sb2.toString())));

	}

}
