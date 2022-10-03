package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cricinfo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.espncricinfo.com/");
		
		List<WebElement> l1= driver.findElements(By.cssSelector("html>body>div>section>section>div:nth-of-type(3)>div>nav>div>div>div>div:nth-of-type(2)>div:first-child>div[class='ds-popper-wrapper']"));
		System.out.println("List count:"+ l1.size());
		
		for(int i =0;i<l1.size();i++) {
			System.out.println(l1.get(i).getText());
		}
		
		List<WebElement> l2= driver.findElements(By.cssSelector("div.ds-bg-fill-navbar>div>div>div:nth-of-type(2)>div:nth-of-type(2)>div"));
		System.out.println("List count:"+ l2.size());
		
		for(int i =0;i<l2.size();i++) {
			System.out.println(l2.get(i).getText());
		}

	}
}