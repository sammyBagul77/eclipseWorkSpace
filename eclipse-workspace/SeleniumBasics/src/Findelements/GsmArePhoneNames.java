package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GsmArePhoneNames {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> l1= driver.findElements(By.cssSelector("body>div#wrapper>div#outer>div#body>aside>div.brandmenu-v2>ul>li"));
		System.out.println("List count:"+ l1.size());
		
		for(int i =0;i<l1.size();i++) {
			System.out.println(l1.get(i).getText());
		}

	}
}