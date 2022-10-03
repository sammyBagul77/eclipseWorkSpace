package seleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.SeleniumUtility;

public class Dependant {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 =new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome","https://www.amazon.in/");
          
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"));
		for(int i=0;i<438;i++) {
			 driver.findElement(By.xpath("//body")).sendKeys(Keys.DOWN);
		}
	Thread.sleep(500);
		WebElement mob =driver.findElement(By.xpath("//div[div[h2[a[span[text()='Samsung Galaxy M33 5G (Deep Ocean Blue, 8GB, 128GB Storage) | 6000mAh Battery | Upto 16GB RAM with RAM Plus | Travel Adapter to be Purchased Separately']]]]]/div[3]/div[2]//a/span[1]"));
	      
		System.out.println(mob.isDisplayed());
		Thread.sleep(500);
		mob.click();
	}

}
