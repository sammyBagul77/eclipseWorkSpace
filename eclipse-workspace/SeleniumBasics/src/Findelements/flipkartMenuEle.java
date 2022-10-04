package Findelements;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartMenuEle {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

List<WebElement> l1 = driver.findElements(By.cssSelector("html>body >div>div>*:nth-of-type(2)>div>div>div.eFQ30H"));
System.out.println("Total count of menu Elements: " + l1.size());

for(int i=0;i<l1.size();i++) {
	System.out.println(l1.get(i).getText());
}

//Iterator itr = l1.iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next().getText());
//}

	}
}