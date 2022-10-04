package seleniumMavenProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.SeleniumUtility;

public class geelksWindoWHandling {
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://practice.geeksforgeeks.org/courses");

	String HmPage  =driver.getWindowHandle();
	System.out.println(HmPage);
	
	driver.findElement(By.xpath("//*[text()='Complete Test Series for Product-Based Companies']")).click();
	
	Set<String> allWind = driver.getWindowHandles();
	System.out.println(allWind);
	
	//removing Hmpage Id
	allWind.remove(HmPage);
	
//	Thread.sleep(2000);
//	driver.switchTo().window(HmPage);
//	driver.close();
	
Iterator<String> itr  = allWind.iterator();
String childWindowId = itr.next();

Thread.sleep(2000);
System.out.println(childWindowId);

driver.switchTo().window(HmPage);
Thread.sleep(2000);
driver.switchTo().window(childWindowId);
driver.close();

driver.switchTo().window(HmPage);
Thread.sleep(500);
driver.findElement(By.xpath("//*[text()='Got it!']")).click();

driver.findElement(By.xpath("//h4[text()='Complete Interview Preparation - Self Paced']")).click();
driver.quit();

	
	
}
}
