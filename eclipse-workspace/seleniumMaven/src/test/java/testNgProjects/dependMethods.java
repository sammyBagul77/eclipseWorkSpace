package testNgProjects;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class dependMethods {
  @Test(priority=3)
  public void test1() {
	 
	  System.out.println("This is Test One");
	  throw new SkipException("Test One is Skipped");
	  
  }
  @Test(priority=5,enabled=true)
  public void test2() {
	  System.out.println("This is Test two");
  }
  @Test(priority=1,enabled=true)
  public void test3() {
	  System.out.println("This is Test three");
	  AssertJUnit.assertTrue(true);
  }
  @Test(priority=2)
  public void test4() {
	  System.out.println("This is Test four");
  }
  @Test(priority=4)
  public void test5() {
	  System.out.println("This is Test five");
  }
}
