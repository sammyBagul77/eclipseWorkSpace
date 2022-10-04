package mouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class asgnFlipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	
	driver.findElement(By.cssSelector("._2hriZF._2rbIyg")).sendKeys(Keys.ESCAPE);
	List<WebElement> mainmenu = driver.findElements(By.xpath("//*[@class='_37M3Pb']/div[@class='eFQ30H']"));
	//List<WebElement> submenu = driver.findElements(By.cssSelector("._3XS_gI._7qr1OC>a"));
	
	for(int i =0 ; i<mainmenu.size();i++) {
		act.moveToElement(mainmenu.get(i)).perform();
		List<WebElement> submenu = driver.findElements(By.cssSelector("._3XS_gI._7qr1OC>a"));//submenu
		for(int j=0;j<submenu.size();j++) {
		System.out.println((j+1)+" "+submenu.get(j).getText());
		Thread.sleep(500);
		}
		System.out.println("*************************************************************");
	  
	}
}
}

