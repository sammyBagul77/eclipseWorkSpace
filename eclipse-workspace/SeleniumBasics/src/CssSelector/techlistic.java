package CssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.techlistic.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("nav>div>div#PageList2 div.overflowable-container.overflowable-3>div:first-child>div>ul.tabs>li:first-child")).click();
	Thread.sleep(20000);
	String javaExpUrl ="https://www.techlistic.com/p/java.html";
	String javaActUrl =driver.getCurrentUrl();
	if(javaActUrl.equals(javaExpUrl)) {
		System.out.println("Validation of Java Url Passed");
	}else {
		System.out.println("Validation of Java Url failed");
	}
	System.out.println("Java Link: "+driver.getCurrentUrl()); 
    driver.navigate().back();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("nav>div>div#PageList2 div.overflowable-container.overflowable-3>div:first-child>div>ul.tabs>li:nth-of-type(2)>div>a")).click();
    Thread.sleep(20000);
    String seleniumExpUrl ="https://www.techlistic.com/p/selenium-tutorials.html";
	String seleniumActUrl =driver.getCurrentUrl();
	if(seleniumActUrl.equals(seleniumExpUrl)) {
		System.out.println("Validation of Selenium Url Passed");
	}else {
		System.out.println("Validation of Selenium Url failed");
	}
	System.out.println("Selenium Link: "+driver.getCurrentUrl()); 
    driver.navigate().back();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("nav>div>div#PageList2 div.overflowable-container.overflowable-3>div:first-child>div>ul.tabs>li:nth-of-type(7)>div>a")).click();
    Thread.sleep(20000);
    String BDDExpUrl ="https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html";
  	String BDDActUrl =driver.getCurrentUrl();
  	if(BDDActUrl.equals(BDDExpUrl)) {
  		System.out.println("Validation of BDD Url Passed");
  	}else {
  		System.out.println("Validation of BDD Url failed");
  	}
	System.out.println("BDD Link: "+driver.getCurrentUrl()); 
	
    driver.navigate().back();
    
	
}
}
