package Findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GsmSamsung {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div.brandmenu-v2>ul>li:nth-of-type(1)")).click();
		
		Thread.sleep(2000);
		List<WebElement> l1 = driver.findElements(By.cssSelector("div.main.main-maker>div:nth-of-type(2)>div>ul>li"));
		System.out.println("List count:" + l1.size());

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i).getText());
		}
		driver.manage().window().setSize(new Dimension (850,900));
	}
}