package Xpath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vtiger {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Lenovo\\eclipse-workspace\\Property\\PropertyFiles\\vTiger.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		String userK = prop.getProperty("userKey");
		String passK = prop.getProperty("passKey");
		String login = prop.getProperty("signIn");
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Adding Explicit Dynamic Wait
		WebDriverWait wait = new WebDriverWait(driver, 50);

		WebElement username = driver.findElement(By.xpath(user));
		username.clear();
		username.sendKeys(userK, Keys.TAB);
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.xpath(pass));
		password.clear();
		password.sendKeys(passK, Keys.TAB);

		driver.findElement(By.xpath(login)).sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@class ='buttonGroups pull-right']"))));

		driver.findElement(By.xpath("//div[@class ='buttonGroups pull-right']/div[1]/button[1]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right widgetsList pull-right']//following-sibling::a"));

		for (WebElement list : li) {
			System.out.println(list.getText());
		}
		System.out.println("size Of List:" + li.size());
		//add widgets
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right widgetsList pull-right']/li[2]//following-sibling::a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class ='buttonGroups pull-right']/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right widgetsList pull-right']/li[5]//following-sibling::a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class ='buttonGroups pull-right']/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right widgetsList pull-right']/li[8]//following-sibling::a")).click();
		//delete widgets
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='widgeticons dashBoardWidgetFooter']/div/a[@name='dclose']")).click();
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='widgeticons dashBoardWidgetFooter']/div/a[@name='dclose']")).click();
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='widgeticons dashBoardWidgetFooter']/div/a[@name='dclose']")).click();
		driver.findElement(By.xpath("//div[@class='modal-footer']/button[2]")).sendKeys(Keys.ENTER);
		
		//logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class ='nav navbar-nav']/li[5]")).click();
		driver.findElement(By.xpath("//a[text() ='Sign Out']")).sendKeys(Keys.ENTER);
		
	}

}
