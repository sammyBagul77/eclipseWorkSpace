package JavaScript;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class vitigerLogin extends SeleniumUtility {
     WebDriver driver;
	@BeforeTest
	public void  beforeMethod() {
	driver =setUp("chrome", "https://demo.actitime.com/login.do");
	
	}
	
	@Test
	public void  testCase() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("document.getElementById('username').value='admin'; ");
	 js.executeScript("document.getElementsByName('pwd')[0].value='manager';");
//	 driver.wait(5);
	 //chekbox
	 js.executeScript("document.getElementById('keepLoggedInCheckBox').checked='true';");
	 js.executeScript("document.getElementById('loginButton').click();");
	 //pgdown
	Thread.sleep(500);
	 js.executeScript("window.scrollBy(0,500)");
	
	}
}
