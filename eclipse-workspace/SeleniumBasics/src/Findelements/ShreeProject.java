package Findelements;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShreeProject {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions act = new Actions(driver);

		// Taking Id Of HomePageWindow
		String homeID = driver.getWindowHandle();
		System.out.println(homeID);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body")).click();
		Thread.sleep(2000);

		// Taking id of ad ChildWindow
		Set<String> id = driver.getWindowHandles();
		id.remove(homeID);

		Iterator<String> itr = id.iterator();
		// Restoring the id value of ad window
		String childWindow = itr.next();

		// closing ad Window
		driver.switchTo().window(childWindow);
		driver.close();

		driver.switchTo().window(homeID);
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Selecting Date
		WebElement dep = driver.findElement(By.id("departure"));
		Thread.sleep(500);
		act.moveToElement(dep).click().build().perform();

		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>:nth-child(2)>:nth-child(3)>div")).click();

	}
}
