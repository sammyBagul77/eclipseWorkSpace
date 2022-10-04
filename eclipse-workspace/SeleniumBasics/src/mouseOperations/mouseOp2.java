package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOp2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	List<WebElement> li = driver.findElements(By.cssSelector("#menu>ul>li>a"));
	
	Actions act =new Actions(driver);
	act.moveToElement(li.get(2)).perform();
	Thread.sleep(2000);
	for(int i=0 ; i<li.size();i++) {
		WebElement option = li.get(i);
		act.moveToElement(option).perform();
		Thread.sleep(1000);
	}
	
	rightClick(act,li.get(4));
}

static void rightClick(Actions act,WebElement option) {
	act.contextClick(option).build().perform();
	//or
//act.moveToElement(option).contextClick().build().perform();
}
}
