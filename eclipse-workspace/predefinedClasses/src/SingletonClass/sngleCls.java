package SingletonClass;
/**
 * 1. constructor should be private
 * 2. create static ref variable of the class
 * 3. create static method which return current class object
 */
class singleton{
	int age =12;
	
	private singleton() {
		System.out.println("This is singleton class");
	}
	public static singleton sngltn = new singleton();
	
	public static singleton getsngltnobj() {
		return sngltn;
	}
	
}

public class sngleCls {
    public static void main(String[] args) {
		
	singleton s1=singleton.getsngltnobj();
	System.out.println(s1.age);
	singleton s2=singleton.getsngltnobj();
	System.out.println(s2.age=13);
}
}