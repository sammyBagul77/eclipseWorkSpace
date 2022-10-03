package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import utility.SeleniumUtility;

public class depend {
	WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		    
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.mycarhelpline.com/");
		  
		
	  }
	  @Test(priority =1,enabled=true)
	  public void calculator() throws InterruptedException {
		  driver.findElement(By.cssSelector("#bluemenu li:nth-of-type(5)>a")).click();
		  Thread.sleep(500);
	  }
	  
	  @Test(priority =2,enabled=true,dependsOnMethods="calculator")
	  public void home() throws InterruptedException {
		  driver.findElement(By.cssSelector("#bluemenu li:nth-of-type(1)>a")).click();
		  Thread.sleep(500);
	  }
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }
}
