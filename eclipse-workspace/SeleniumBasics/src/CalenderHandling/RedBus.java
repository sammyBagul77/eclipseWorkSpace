package CalenderHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement from = driver.findElement(By.id("src"));
	from.click();
	from.sendKeys("Pune");
	Thread.sleep(1000);
	WebElement to = driver.findElement(By.id("dest"));
	to.click();
	to.sendKeys("Goa");
	Thread.sleep(1000);
	
	WebElement Date = driver.findElement(By.id("onward_cal"));
	Date.click();
	
	driver.findElement(By.cssSelector(".next")).click();
	driver.findElement(By.cssSelector(".rb-calendar tbody>tr:nth-of-type(4)>td:nth-of-type(4)")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("search_btn")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("label[for='dtBefore 6 am']")).click();

	driver.findElement(By.cssSelector("label[title='AC']")).click();
	
	Thread.sleep(2000);
	List<WebElement> Names =driver.findElements(By.cssSelector(".sort-results #result-section>div:nth-of-type(2) .bus-items .column-two.p-right-10.w-30.fl"));
	System.out.println("Size: "+Names.size());
	Thread.sleep(2000);
List<String> name = new ArrayList<String>();
for(int i=0;i<Names.size();i++) {
	name.add(Names.get(i).getText());
}
Thread.sleep(2000);
List <WebElement> Prices =driver.findElements(By.cssSelector(".column-seven.p-right-10.w-15.fl .f-19"));
System.out.println("Price Size: "+Prices.size());
System.out.println("-----------------------------------------------------------------------");
List<Float> price = new ArrayList<Float>();
for(int i =0;i<Prices.size();i++) {
	String p = Prices.get(i).getText();
	price.add(Float.parseFloat(p));
}
//Names and Prices
for(int i=0;i<name.size();i++) {
	System.out.println(name.get(i)+": "+price.get(i));
	System.out.println("-----------------------------------------------------------------------");
}


}
}
