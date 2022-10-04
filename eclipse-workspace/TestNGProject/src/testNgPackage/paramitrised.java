package testNgPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class paramitrised {
	
@Parameters({"browser","username","password"})
@Test
public void Testcase1(String browser,String username,String password) {
	System.out.println("Browser passed as :- "+ browser);
	System.out.println("Username passed as :- "+ username);
	System.out.println("Browser passed as :- "+ password);
}

@Parameters({"browser","appurl","username","password"})
@Test
public void Testcase2(String browser,String appurl,String username,String password) {
	SeleniumUtility s1 = new SeleniumUtility();
	WebDriver driver = s1.setUp(browser,appurl);
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
}


}
