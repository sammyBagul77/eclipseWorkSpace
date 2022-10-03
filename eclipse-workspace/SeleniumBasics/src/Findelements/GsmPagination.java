package Findelements;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GsmPagination {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.gsmarena.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("div.brandmenu-v2 >ul>li:first-child")).click();
	List<WebElement> l1 = driver.findElements(By.cssSelector("div.review-nav >div.nav-pages>a"));
	System.out.println(l1.size());
	Thread.sleep(2000);
	for (int i = 0; i < l1.size(); i++) {
		System.out.println(l1.get(i).getText());
	}

//	int count=0;
//	Iterator itr = l1.iterator();
//	while(itr.hasNext()) {
//		itr.next();
//		count++;
//	}
//	System.out.println("Pagination Count:"+count);
//	driver.close();
}
}
