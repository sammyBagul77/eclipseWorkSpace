package seleniumMavenProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class practEx {
WebDriver driver;
@BeforeTest
   public void beforeTest() {
	   System.out.println("I am before Test");
   }

  @BeforeMethod
  public void beforeMethod() {
//	  WebDriverManager.chromedriver().setup();
//	  driver = new ChromeDriver();
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in/");
  }
  @Test
  public void mobile (){
	  driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.titleIs("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"));
	  AssertJUnit.assertEquals(driver.getTitle(), "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");
  }
  
  @Test
  public void books(){
	  driver.findElement(By.xpath("//a[text()='Books']")).click();
	 
	  AssertJUnit.assertEquals(driver.getTitle(), "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");
  }
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  
  @AfterTest
  public void afterTest() {
	   System.out.println("I am after Test");
  }

}
