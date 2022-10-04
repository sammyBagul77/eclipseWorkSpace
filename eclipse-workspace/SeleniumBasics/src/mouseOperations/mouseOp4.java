package mouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseOp4 {
	public static void main(String[] args) throws InterruptedException {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.facebook.com/");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);

		driver.findElement(By.xpath("//a[text() ='Create New Account']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@*='firstname']")));
		WebElement usernameField = driver.findElement(By.xpath("//*[@*='firstname']"));
//		usernameField.click();
//		usernameField.sendKeys("admin",Keys.chord( Keys.CONTROL, "a"));
		
		act.doubleClick(usernameField).perform();
		usernameField.sendKeys("admin");
	usernameField.sendKeys(Keys.chord(Keys.CONTROL, "a"),Keys.chord(Keys.CONTROL,"c"));
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.click();
		Thread.sleep(1000);
		lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
}
