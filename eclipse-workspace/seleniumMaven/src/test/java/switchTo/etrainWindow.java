package switchTo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtility;

public class etrainWindow {
public static void main(String[] args) {
	SeleniumUtility s1 = new SeleniumUtility();
	WebDriver driver = s1.setUp("chrome","https://etrain.info/in");
	
	String HomeWindowId = driver.getWindowHandle();
	System.out.println(HomeWindowId);
	
	// remove home window id from all window id dn you will get child window id
	driver.findElement(By.xpath("//div[2]/div[@class='pdud5']/a[4]")).click();
	Set<String> s = driver.getWindowHandles();
	System.out.println("--------------------------------------------------");
	System.out.println("All Windows Id: "+ s);
	System.out.println("--------------------------------------------------");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	s.remove(HomeWindowId);
	
	// get child window id using iterator
	Iterator<String> itr = s.iterator(); 
	String childWind = itr.next();
	
	driver.switchTo().window(childWind);
	System.out.println("--------------------------------------------------");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.close();
	System.out.println("--------------------------------------------------");
	driver.switchTo().window(HomeWindowId);
	System.out.println("etrain page title: " + driver.getTitle());
	System.out.println("etrain page ulr: " + driver.getCurrentUrl());
	System.out.println("--------------------------------------------------");
	driver.close();
}
}
