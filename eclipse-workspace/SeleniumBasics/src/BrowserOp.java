
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//To maximaize the window
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//navigate to back page
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		//navigate to forword
		driver.navigate().forward();
		
		//to minimize window
		driver.manage().window().setSize(new Dimension (600,700));

		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.google.com/");
		
	}

}
