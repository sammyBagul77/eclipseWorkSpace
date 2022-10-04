package switchTo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtility;

public class draAsgnmt {
public static void main(String[] args) throws InterruptedException {
	SeleniumUtility s1 = new SeleniumUtility();
	WebDriver driver = s1.setUp("chrome", "https://jqueryui.com/droppable/");
	
	driver.findElement(By.xpath("//a[text() ='Sortable']")).click();
	WebElement frame = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frame);
	
	//WebDriverWait wait = new WebDriverWait(driver,20);
	
	List<WebElement> dragLi = driver.findElements(By.cssSelector("#sortable>li"));
	
	for(int i =0; i<dragLi.size();i++) {
		s1.performDragAndDrop(dragLi.get(6-i), dragLi.get(0));
			Thread.sleep(500);
	}
	
}
}
