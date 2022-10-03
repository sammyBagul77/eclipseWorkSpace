package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class example2 {
	//sequence = BT/BM/T1/AM/BM/T2/AM/AT
	 @BeforeMethod
	 public void openingBrowser() {
		 System.out.println("Browser is Opening");
	 }
	 @Test
	 public void Operation1() {
		 System.out.println("Performing first operation");
	 }
	 @Test
	 public void Operation2() {
		 System.out.println("Performing second operation");
	 }
	 @AfterMethod
	 public void closingWindow() {
		 System.out.println("windowClosed");
	 }
  @BeforeTest
  public void validatingTitle() {
	  System.out.println("validating Title of webPage");
  }

  @AfterTest
  public void closingDriver() {
	  System.out.println("DriverClosed");
  }

}
