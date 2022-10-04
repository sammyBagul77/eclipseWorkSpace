package Findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookdDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.cssSelector("#email"));
		System.out.println(user.getAttribute("placeholder"));

		// Create New Account
		WebElement CreateAcc = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
		CreateAcc.click();

		// DOB-Date
		WebElement day = driver.findElement(By.cssSelector("#day"));
		System.out.println("day is visible:" + day.isDisplayed());
		System.out.println("day is Enable:" + day.isEnabled());
		System.out.println("day is Selected:" + day.isSelected());
		System.out.println("Name: " + day.getAttribute("name"));
		System.out.println("Default value:" + day.getAttribute("value"));
		Thread.sleep(2000);
		day.findElement(By.cssSelector("option[value='25']")).click();
		System.out.println("Updated value:" + day.getAttribute("value"));
		List<WebElement> l1 = day.findElements(By.cssSelector("span._5k_4>span>select>option"));
		System.out.println("Option size of Day:" + l1.size());
		System.out.println("************************************************************************************");

		// DOB-month
		WebElement month = driver.findElement(By.cssSelector("#month"));
		System.out.println("Month is visible:" + month.isDisplayed());
		System.out.println("Month is Enable:" + month.isEnabled());
		System.out.println("Month is Selected:" + month.isSelected());
		System.out.println("Name: " + month.getAttribute("name"));
		System.out.println("Default value:" + month.getAttribute("value"));
		Thread.sleep(2000);
		month.findElement(By.cssSelector("option[value='6']")).click();
		System.out.println("Updated value:" + month.getAttribute("value"));
		List<WebElement> l2 = month.findElements(By.cssSelector("span._5k_4>span>select>option"));
		System.out.println("Option size of month:" + l2.size());

		// DOB-year
		WebElement year = driver.findElement(By.cssSelector("#year"));
		System.out.println("Year is visible:" + year.isDisplayed());
		System.out.println("Year is Enable:" + year.isEnabled());
		System.out.println("Year is Selected:" + year.isSelected());
		System.out.println("Name: " + year.getAttribute("name"));
		System.out.println("Default value:" + year.getAttribute("value"));
		Thread.sleep(2000);
		year.findElement(By.cssSelector("option[value='1997']")).click();
		System.out.println("Year value:" + year.getAttribute("value"));
		List<WebElement> l3 = year.findElements(By.cssSelector("span._5k_4>span>select>option"));
		System.out.println("Option size of Year:" + l3.size());

	}

}
