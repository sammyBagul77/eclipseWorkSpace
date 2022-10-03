package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newBasic {
public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
	
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("https://demo.actitime.com/login.do");
  
  WebElement user = driver.findElement(By.className("textField"));
  user.click();
  user.sendKeys("admin");
  System.out.println(user.getTagName());
  
  WebElement pass = driver.findElement(By.name("pwd"));
  pass.click();
  pass.sendKeys("manager");
  
  driver.findElement(By.partialLinkText("Login")).click();
}
}
