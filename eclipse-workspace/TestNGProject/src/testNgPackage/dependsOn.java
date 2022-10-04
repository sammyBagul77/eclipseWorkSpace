package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
//in depends On method, if testcase fail then the method which depends on that method will not execute
public class dependsOn {
  @Test(enabled =true)
  public void openBrowserUrl() {
	  int i=10/0;
	  System.out.println("Opren Browser AppUrl");
  }
  
  @Test(enabled =true,dependsOnMethods="openBrowserUrl")
  public void login() {
	  System.out.println("Enter UserName, Password or cliclk on Url Button");
  }
  
  @Test(enabled=true)
  public void createTask(){
	  System.out.println("create new Task");
  }
  
  @Test(enabled=true)
  public void logout(){
	  System.out.println("Logout");
  }
}
