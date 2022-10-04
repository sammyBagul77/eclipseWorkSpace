package Findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleEx1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.name("q")).sendKeys("selenium interview questions");
	Thread.sleep(2000);
	List<WebElement> l1 = driver.findElements(By.cssSelector("ul>li>div>div.pcTkSc>div[class=wM6W7d]>span"));
	System.out.println("List count: "+ l1.size());
	
	for(int i=0; i<l1.size();i++) {
		System.out.println(l1.get(i).getText());
	}
}
}
