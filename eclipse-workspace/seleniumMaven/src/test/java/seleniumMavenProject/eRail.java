package seleniumMavenProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class eRail {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://erail.in/");
	String hmPage = driver.getWindowHandle();
	
	//identifying childwindow id
	driver.findElement(By.xpath("//a[text() ='eCatering']")).click();
	Set<String> allwindows = driver.getWindowHandles();
	allwindows.remove(hmPage);
	
	//closing homePage
	driver.switchTo().window(hmPage);
	driver.close();

	Iterator<String> itr = allwindows.iterator();
	String childWindow = itr.next();
	driver.switchTo().window(childWindow);

	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']")).click();
	driver.switchTo().activeElement().sendKeys("12859");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='GITANJALI EXP']")).click();
	
	//Date
	WebElement cal = driver.findElement(By.name("date"));
	cal.click();
	cal.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER,Keys.TAB,Keys.UP,Keys.RIGHT,Keys.ENTER);
	Thread.sleep(1000);
	//station
	WebElement stat=driver.findElement(By.xpath("//select[@placeholder='Boarding Station']"));
	stat.click();
	stat.sendKeys("Akola",Keys.ENTER,Keys.TAB,Keys.ENTER);

	//Station list
	List<WebElement> statLi = driver.findElements(By.cssSelector(".flex.flex-col>div>.flex.flex-1.flex-row.gap-1>div>div:first-child"));
for(int i =0; i<statLi.size();i++) {
	System.out.println(statLi.get(i).getText()+": ");
	
	List<WebElement> subLi =driver.findElements(By.cssSelector("div.flex.flex-1.flex-col.py-3 >.flex.items-center.flex-wrap.mb-2>h5.tracking-normal "));
	Thread.sleep(500);
	for(int j =0;j<subLi.size();j++) {
		System.out.println(subLi.get(j).getText());
		
		}
	System.out.println("*******************************************");
	
}
	
}
}
