package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class asgncricinfo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.espncricinfo.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,60);
	driver.findElement(By.xpath("//*[@id='main-container']/div[6]/div/a[1]/span")).click();
	
	//popup Handled
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Not Now']")));
	try {
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	}catch(Throwable e) {
		System.out.println("No popup Handeled");
	}
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1")));
	List<WebElement> li = driver.findElements(By.cssSelector(".ds-items-center.ds-justify-between.ds-flex-1>div>div"));
	
	
	for(int i =0 ; i<li.size();i++) {
		
		System.out.println(li.get(i).getText()+": ");
		act.moveToElement(li.get(i)).perform();
		Thread.sleep(1000);
		List<WebElement> subLi = driver.findElements(By.cssSelector(".ds-px-2.ds-py-2>ul>li>a>span"));
		for(int j =0; j<subLi.size();j++) {
			
			System.out.println((j+1)+": "+subLi.get(j).getText());
			Thread.sleep(2000);
		}
		System.out.println("**************************************************");
			}
}
}