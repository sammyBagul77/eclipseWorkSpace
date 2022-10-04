package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class example1 {
	int age =25;
//If we not write @Test then that test will not execute
	void display() {
		System.out.println("I am display method");
	}
  @Test
  public void testCase1() {
	 System.out.println("I am test case 1");
	 System.out.println("Age: "+ age );
  }
}
