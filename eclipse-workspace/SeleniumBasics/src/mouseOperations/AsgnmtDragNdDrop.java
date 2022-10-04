package mouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AsgnmtDragNdDrop {
public static void main(String[] args) {
	String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", chromeExePath);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(" https://the-internet.herokuapp.com/drag_and_drop");
	
	WebDriverWait wait = new WebDriverWait(driver,20);

	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#column-a")));
	Actions act = new Actions(driver);
WebElement src = driver.findElement(By.cssSelector("#column-a"));
wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#column-b")));
WebElement target = driver.findElement(By.cssSelector(".column:nth-of-type(2)"));

act.dragAndDrop(src, target).perform();
act.moveToElement(target).build().perform();

}
}
