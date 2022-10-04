package Synchro;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InExOrange {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//LoginpageURL
			String loginUrl ="https://opensource-demo.orangehrmlive.com/";
			String curntUrl = driver.getCurrentUrl();
			System.out.println(loginUrl.equals(curntUrl));
			
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		//HomepgUrlpageURL
		String HmUrl ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String curtUrl = driver.getCurrentUrl();
		System.out.println(HmUrl.equals(curtUrl));
		
		//HomepageTitle
		String HmTitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		System.out.println(HmTitle.equals(ExpectedTitle));
		Thread.sleep(1000);
		//logout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
