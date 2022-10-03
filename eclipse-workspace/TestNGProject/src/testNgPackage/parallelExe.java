package testNgPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class parallelExe{
	
 WebDriver driver;
	@Parameters({"browser","username","password","appurl"})
	@Test
	public void login(String browser,String username,String password,String appurl){
		SeleniumUtility s1 = new SeleniumUtility();
		if(browser.equalsIgnoreCase("chrome")) {
			driver=s1.setUp(browser, appurl);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=s1.setUp(browser, appurl);
		}
	//	driver.findElement(By.id("username"))
	WebElement user = driver.switchTo().activeElement();
		user.clear();
		user.sendKeys(username, Keys.TAB);
		WebElement pass = driver.switchTo().activeElement();
		pass.clear();
		pass.sendKeys(password,Keys.ENTER);
		System.out.println(Thread.currentThread().getId());
	}
}
