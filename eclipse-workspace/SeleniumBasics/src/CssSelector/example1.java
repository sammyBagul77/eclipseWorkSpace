package CssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	WebElement username =driver.findElement(By.cssSelector("input#username"));
	username.clear();
	username.sendKeys("admin");
	System.out.println(username.isDisplayed());
	System.out.println(username.isEnabled());
	System.out.println("************************************************************");
	WebElement password = driver.findElement(By.cssSelector("input#password"));
	password.clear();
	password.sendKeys("Test@123");
	System.out.println(password.isDisplayed());
	System.out.println(password.isEnabled());
	System.out.println("************************************************************");
	WebElement login = driver.findElement(By.cssSelector(".button.buttonBlue"));
	System.out.println(login.isDisplayed());
	System.out.println(login.isEnabled());
	login.click();
	//adding  three widgets
	Thread.sleep(4000);
	driver.findElement(By.cssSelector(".tab-content div>button[data-toggle='dropdown']")).click();
	driver.findElement(By.cssSelector("a[data-linkid='58']")).click();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector(".tab-content div>button[data-toggle='dropdown']")).click();
	driver.findElement(By.cssSelector("a[data-linkid='61']")).click();
	driver.findElement(By.cssSelector(".tab-content div>button[data-toggle='dropdown']")).click();
	driver.findElement(By.cssSelector("a[data-linkid='62']")).click();
	Thread.sleep(4000);
	//logout account
	driver.findElement(By.cssSelector("span[class ='fa fa-user']")).click();
	driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	
	
	
}
}