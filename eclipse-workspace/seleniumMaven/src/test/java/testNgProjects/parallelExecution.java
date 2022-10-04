package testNgProjects;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class parallelExecution {
	
	WebDriver driver;
	
	@Parameters({"browser","appUrl"})
	@BeforeMethod
	public void Method(String browser,String appUrl) {
		SeleniumUtility s1 = new SeleniumUtility();
		if(browser.equalsIgnoreCase("chrome")) {
		driver=s1.setUp(browser, appUrl);
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=s1.setUp(browser, appUrl);
		}
	}
	  @Test
	  public void testcase1() throws InterruptedException {
		  
		 driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		 }
	  @Test
	  public void testcase2() throws InterruptedException {
		  
		 System.out.println("I am test case two");
		
		 }
	 
}
