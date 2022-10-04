package testNgPackage;

import org.testng.annotations.Test;

public class grpTest {
  @Test(groups="Smoke")
  public void TestCase1() {
	  System.out.println("I am smoke test 1");
  }
  @Test(groups="Regression")
  public void TestCase2() {
	  System.out.println("I am regression test 2");
  }
  
  @Test(groups="Smoke")
  public void TestCase3() {
	  System.out.println("I am smoke test 3");
  }
  @Test(groups="Smoke")
  public void TestCase4() {
	  System.out.println("I am smoke test 4");
  }
  @Test(groups="Regression")
  public void TestCase5() {
	  System.out.println("I am regression test 3");
  }
  @Test(groups="Smoke Test")
  public void TestCase6() {
	  System.out.println("I am smoke test 6");
  }
  @Test(groups="Regression")
  public void TestCase7() {
	  System.out.println("I am regression test 7");
  }
}
