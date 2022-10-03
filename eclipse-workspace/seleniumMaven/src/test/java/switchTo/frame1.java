package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtility;

public class frame1 {
public static void main(String[] args) throws InterruptedException {
	SeleniumUtility s1 = new SeleniumUtility();
	
	WebDriver driver = s1.setUp("chrome", "https://jqueryui.com/droppable/");
	driver.findElement(By.xpath("//div[@id='sidebar']//ul/li[2]")).click();
	
	WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(iframe);
	
	WebElement src = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	s1.performDragAndDrop(src, target);
	//Or
	//SeleniumUtility.action.dragAndDrop(src, target).build().perform();
	
	driver.switchTo().defaultContent();
	//Above statement move on default webelement
	driver.findElement(By.className("logo")).click();
}
}
