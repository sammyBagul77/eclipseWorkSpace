package ExPropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class act {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Property\\PropertyFiles\\actTime.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
	String Url = prop.getProperty("url");
	String userN= prop.getProperty("loguser");
	String passW = prop.getProperty("logpass");
	String ID = prop.getProperty("userid");
	String Pass = prop.getProperty("passname");
		
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get(Url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement name = driver.findElement(By.id(ID));
	name.sendKeys(userN);
	WebElement Pword = driver.findElement(By.name(Pass));
	Pword.sendKeys(passW);
	driver.findElement(By.linkText("Login")).click();
	driver.close();
		
	}

}
