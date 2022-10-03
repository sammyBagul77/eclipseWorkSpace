package immutable_class;
/**
 * Immutable Class: its value can't be changed, if you change new object will be created
 * 1. class and data variable should be declared as final
 * 2. constructor should be parameterized, to initialize final data variable
 * 3. use only getter method to get final variables value
 */
final class imu{
	final String name;
	final int val;
	
	imu(String n,int va){
		name =n;
		val =va;
	}
	
	public String getName() {
		return name;
	}
	public int getsal() {
		return val;
	}
	
}
public class example {
 public static void main(String[] args) {
	imu i1 = new imu("Dinesh",12000);
	System.out.println("Name of Person: "+ i1.name);
	System.out.println("Salary of Person: "+ i1.val);
	//To change its data variable value create new object
	imu i2 = new imu("Samarth",100000);
	System.out.println("Name of Person: "+ i2.name);
	System.out.println("Salary of Person: "+ i2.val);
}
}
