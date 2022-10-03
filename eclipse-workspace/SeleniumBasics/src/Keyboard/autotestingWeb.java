package Keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autotestingWeb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//identifying the first name element
	WebElement firstname = driver.findElement(By.xpath("//input[ @ng-model='FirstName']"));
	Thread.sleep(2000);
	firstname.sendKeys("Samarth",Keys.chord(Keys.CONTROL,"a"));//selectingfirst name cntrl +a
	//copying first name cntrl +c
	firstname.sendKeys(Keys.CONTROL,"c");
	//Last Name
	WebElement lastname =driver.findElement(By.cssSelector("div.form-group>div:nth-of-type(2)>input[ng-model='LastName']"));
	lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	Thread.sleep(2000);
	lastname.clear();
	Thread.sleep(1000);
	lastname.sendKeys("Bagul");
}
}
