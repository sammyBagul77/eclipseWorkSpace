package CssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Amazon Pay")).click();
	String ApayExpTitle ="Amazon Pay";
	String ApayActTitle =driver.getTitle();
	if(ApayActTitle.equals(ApayExpTitle)) {
	System.out.println("Title Verification Is Passed For Amazon Pay");
	}else {
		System.out.println("Title Verification Is Failed For Amazon Pay");
	}
	driver.navigate().back();
	Thread.sleep(1000);
	String HmExpTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String HmActTitle =driver.getTitle();
	if(HmActTitle.equals(HmExpTitle)) {
	System.out.println("Title Verification Is Passed For Home Page");
	}else {
		System.out.println("Title Verification Is Failed For Home Page");
	}
	
	//prime
	Thread.sleep(2000);
	driver.findElement(By.linkText("Prime")).click();
	String PrimeExpTitle ="Amazon.in: Amazon Prime";
	String PrimeActTitle =driver.getTitle();
	if(PrimeActTitle.equals(PrimeExpTitle)) {
	System.out.println("Title Verification Is Passed For Prime");
	}else {
		System.out.println("Title Verification Is Failed For Prime");
	}
	driver.navigate().back();
	Thread.sleep(2000);
	driver.close();
	
}
}
