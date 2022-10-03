package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseOp3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	Actions act = new Actions(driver);
	
	WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
	driver.switchTo().frame(frame);


	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='gallery']/li/img")));

	List<WebElement> imgs = driver.findElements(By.cssSelector("ul#gallery>li>img"));
	
	WebElement target = driver.findElement(By.cssSelector("div#trash"));
	
//	Thread.sleep(2000);
//	act.dragAndDrop(imgs.get(0),target).build().perform();
//	Thread.sleep(1000);
//	act.dragAndDrop(imgs.get(1),target).build().perform();
//	Thread.sleep(1000);
//	act.dragAndDrop(imgs.get(2),target).build().perform();
//	Thread.sleep(1000);
//	act.dragAndDrop(imgs.get(3),target).build().perform();
					//OR
	mouseDragdrop(act, imgs.get(0),target);
	mouseDragdrop(act,imgs.get(1),target);
}

static void mouseDragdrop(Actions act,WebElement src,WebElement target) {
	act.dragAndDrop(src, target).build().perform();
	
}
}
