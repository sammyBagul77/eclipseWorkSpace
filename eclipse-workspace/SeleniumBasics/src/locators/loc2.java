package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.*;
public class loc2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\geckodriver.exe");
		ChromeDriver d =new ChromeDriver();
			d.get("https://demo.actitime.com/login.do");
//         d.getCurrentUrl();
		//username
		WebElement username= d.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		// password
		WebElement password = d.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		
		WebElement login = d.findElement(By.id("loginButton"));
		login.click();
		
	}

}
