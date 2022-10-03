package SystemClass;

public class ex1 {
	public static void main(String[] args) {
		// Checking Specific property
		System.out.println("System User directory:" + System.getProperty("user.home"));
		System.out.println("Current working directory:" + System.getProperty("user.dir"));
		System.out.println("******************************************");
		// Clearing the properties
System.out.println(System.clearProperty("user.home"));
System.out.println("System User directory:"+ System.getProperty("user.home"));
//setting the properties
System.out.println(System.setProperty("user.home", "G:\\Java"));
System.out.println("Updated System User directory:"+ System.getProperty("user.home"));
//setting Specific Property
System.out.println("Setting Country Name: " + System.setProperty("user.country","IND"));
//Checking Updated Property
System.out.println("Updated Country:" + System.getProperty("user.country"));
System.out.println("time in millisec: "+ System.currentTimeMillis());
System.out.println("time in nanosec: "+ System.nanoTime());
	}

}
