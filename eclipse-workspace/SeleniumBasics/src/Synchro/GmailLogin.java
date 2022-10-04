package Synchro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
public static void main(String[] args) {
	String chromeExePath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
	//setting the path for driver executable
	System.setProperty("webdriver.gecko.driver", chromeExePath);
	//creating an instance of Chrome browser and up-casting it to WebDriver interface
	WebDriver driver=new FirefoxDriver();
	//to enter required application URL use get() of WebDriver interface
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//explicit wait dynamicWait
	WebDriverWait wait =new WebDriverWait(driver,20);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("monobagul25");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	//password
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)))
}
}
