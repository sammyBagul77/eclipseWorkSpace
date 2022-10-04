package Findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orng2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String PageTitle = driver.getTitle();
		System.out.println("Page Title: " + PageTitle);
		String ExpectedTitle = "OrangeHRM";
		System.out.println(PageTitle.length());
		
		if (PageTitle.equals(ExpectedTitle)) {
			System.out.println("Title Validation Passed");
		} else {
			System.out.println("Title Validation Failed");
		}

		String PageURL = driver.getCurrentUrl();
		String ExpectedURL = "https://opensource-demo.orangehrmlive.com/";
		
		WebElement username = driver.findElement(By.name("username"));

		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("password"));

		password.sendKeys("admin123");

		WebElement LoginButton = driver.findElement(By.cssSelector(".oxd-button"));
		LoginButton.click();

		
//		String homepageURL= driver.getCurrentUrl();
//		System.out.println("Home Validation Passed: "+homepageURL.contains("dashboard"));
//		
//		//identify profile & click on it
//		driver.findElement(By.id("Welcome")).click();
//		
//		//identify logout link & click on it
//		driver.findElement(By.linkText("Logout")).click();
//		
		//driver.close();
		
		
	}

}