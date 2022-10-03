package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import utility.SeleniumUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class befMeth_Test_AftMeth {
 WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	 // System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
//	                OR
//	  WebDriverManager.chromedriver().setup();
//	  driver = new ChromeDriver();
//	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	  driver.manage().window().maximize();
//	  driver.get("https://www.mycarhelpline.com/");
	  				//OR
	  SeleniumUtility s1 = new SeleniumUtility();
	 driver= s1.setUp("chrome","https://www.mycarhelpline.com/" );
  }
  @Test(priority =1)
  public void calculator() throws InterruptedException {
	  driver.findElement(By.cssSelector("#bluemenu li:nth-of-type(5)>a")).click();
	  Thread.sleep(500);
  }
  
  @Test(priority =2)
  public void home() throws InterruptedException {
	  driver.findElement(By.cssSelector("#bluemenu li:nth-of-type(1)>a")).click();
	  Thread.sleep(500);
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
