package ExPropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrngHrm {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Property\\PropertyFiles\\OrangeHrm.properties");
    Properties prop = new Properties();
   //loading files
    prop.load(fis);
    String url =prop.getProperty("url");
    String user = prop.getProperty("username");
    String pass = prop.getProperty("password");
    String button = prop.getProperty("button");
    String userKey = prop.getProperty("userkey");
    String passKey = prop.getProperty("passKey");
   System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();
   driver.get(url);
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   Thread.sleep(2000);
  WebElement username= driver.findElement(By.cssSelector(user));
  username.click();
  username.clear();
  username.sendKeys(userKey);
  Thread.sleep(2000);
  WebElement password= driver.findElement(By.cssSelector(pass));
  password.click();
  System.out.println(password.getAttribute("placeholder"));//returns the value of key
  password.sendKeys(passKey);
  
  driver.findElement(By.cssSelector(button)).click();
  Thread.sleep(2000);
driver.findElement(By.className("oxd-userdropdown")).click();
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(4000);
driver.findElement(By.cssSelector(".oxd-text.oxd-text--p.orangehrm-login-forgot-header")).click();
   
    
}
}
