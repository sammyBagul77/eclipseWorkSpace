package Keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws InterruptedException {
	String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	//setting the path for driver executable
	System.setProperty("webdriver.chrome.driver", chromeExePath);
	//creating an instance of Chrome browser and up-casting it to WebDriver interface
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//to enter required application URL use get() of WebDriver interface
	driver.get("https://www.flipkart.com/");
	
	WebElement element =driver.findElement(By.xpath("//body"));
	element.sendKeys(Keys.ESCAPE);
	//performing pageDown Operation
//	for(int i=0;i<6;i++)
//			{
//		element.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(1500);
//			}	
	//OR
	element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	Thread.sleep(2000);
	element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
	
	Thread.sleep(1000);
//	WebElement ele =driver.findElement(By.xpath("//body"));
//	ele.sendKeys(Keys.chord(Keys.CONTROL,"R"));
	driver.navigate().refresh();
//	/**
//	 * possible ways to refresh the browser:
//	 * 1. driver.navigate().refresh();
//	 * 2. sendKeys(Keys.F5)
//	 * 3. by hitting same URL again
//	 * 4. ctrl+R
//	 */
	
	
}
}
