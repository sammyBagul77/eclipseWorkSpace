package String_class;

public class ex10_srngBuff {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Banglore is IT hub");
		//reverse
		System.out.println("Reversing String : "+ s1.length());
		System.out.println("Reversing String : "+ s1.reverse());
		System.out.println("********************************************************");
		//Capacity
		System.out.println("Capcity of String : "+ s1.capacity());// (16*2)+2=34 i.e (old capacity*2)+2  
		System.out.println("********************************************************");
		//Default Capacity
		StringBuffer s2 = new StringBuffer();
		System.out.println("Default capcity of String : "+ s2.capacity());
		s1.append("it is very nice place");
		System.out.println("Capcity of String : "+ s1.capacity());
	}

}
