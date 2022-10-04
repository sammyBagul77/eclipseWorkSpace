package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//if we run this test cases without setting priority they will not execute in order
//beforetest will run before executing testcases and after test will run after all testcases execution
public class bATest {
	WebDriver driver;
  @Test(priority=1)
  public void newsTab() throws InterruptedException {
	  System.out.println("Opening News Tab");
	  driver.findElement(By.cssSelector(".item-10>a")).click();
	  Thread.sleep(500);
  }
  
  @Test(priority=2)
  public void headerSub(){
	  System.out.println("Getting List of SubHeader");
	 List<WebElement> submenu=driver.findElements(By.xpath("//div[1]//div[@class='footer-top-box']/div"));
	 for(WebElement li: submenu) {
		 System.out.println(li.getText());
	 }
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.mycarhelpline.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
