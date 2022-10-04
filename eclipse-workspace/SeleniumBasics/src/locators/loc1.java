package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loc1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
	driver.get(" https://opensource-demo.orangehrmlive.com/");
		String ExpTitle ="OrangeHRM";
		String ActTitle =driver.getTitle();
		System.out.println("Titles are matching:"+(ActTitle.equals(ExpTitle)));
		
		//Username
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.clear();
		username.sendKeys("Admin");
		
		//password
		WebElement password =driver.findElement(By.name("txtPassword"));
		password.clear();
		password.sendKeys("admin123");
		
		//login
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		
		driver.close();
		
	}
}
