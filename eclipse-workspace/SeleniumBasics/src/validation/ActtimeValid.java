package validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActtimeValid {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
		
		FirefoxDriver f = new FirefoxDriver();
		f.get("https://demo.actitime.com/login.do");
		f.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//username
		WebElement Usrname = f.findElement(By.id("username"));
	    Usrname.sendKeys("admin");
		System.out.println(Usrname.isDisplayed());
		System.out.println(Usrname.isEnabled());
		System.out.println("*********************************************");
		//password
		WebElement password = f.findElement(By.name("pwd"));
//		password.sendKeys("manager");
		System.out.println(password.isDisplayed());
		System.out.println(password.isEnabled());
		System.out.println(password.getAttribute("placeholder"));
		System.out.println("*********************************************");
		//login
		WebElement login = f.findElement(By.id("loginButton"));
		System.out.println(login.isDisplayed());
		System.out.println(login.isEnabled());
		System.out.println("*********************************************");
		//keep me login
		WebElement kmlogin = f.findElement(By.id("keepLoggedInLabel"));
		System.out.println(kmlogin.isDisplayed());
		System.out.println(kmlogin.isEnabled());
		kmlogin.click();
		
		Thread.sleep(2000);
		System.out.println("*********************************************");
		//checkbox
		WebElement cbox = f.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(cbox.isDisplayed());
		System.out.println(cbox.isEnabled());
		System.out.println(cbox.isSelected());
		System.out.println("*********************************************");
		// forgot password
		WebElement forgot = f.findElement(By.id("toPasswordRecoveryPageLink"));
		System.out.println(forgot.isDisplayed());
		System.out.println(forgot.isEnabled());
		System.out.println(forgot.getTagName());
		forgot.click();
		
		f.close();
			}

}
