package switchTo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumUtility;

public class actitimeActiveElement {
	public static void main(String[] args) {
     SeleniumUtility s1 = new SeleniumUtility();
     WebDriver driver = s1.setUp("chrome", "https://demo.actitime.com/login.do");
     
    WebElement username = driver.switchTo().activeElement();
    System.out.println(username.getAttribute("placeholder"));
    username.sendKeys("admin",Keys.TAB);
    
    driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}
}
