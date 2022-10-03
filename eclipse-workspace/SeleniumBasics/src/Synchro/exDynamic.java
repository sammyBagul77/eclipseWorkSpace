package Synchro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exDynamic {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Property\\PropertyFiles\\actTime.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String user = prop.getProperty("userid");
		String pass = prop.getProperty("passname");
		String userK = prop.getProperty("loguser");
		String passK =prop.getProperty("logpass");
		
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(user)));
		WebElement username = driver.findElement(By.id(user));
		username.click();
		username.sendKeys(userK,Keys.TAB);
		
		driver.findElement(By.name(pass)).sendKeys(passK,Keys.TAB);
		driver.findElement(By.linkText("Login")).sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
		System.out.println("Current Page Title: "+driver.getTitle());
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
