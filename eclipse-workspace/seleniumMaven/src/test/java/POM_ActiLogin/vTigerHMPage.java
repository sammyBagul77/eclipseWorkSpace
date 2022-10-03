package POM_ActiLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vTigerHMPage {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	vTigerPgFactHM logRef = new vTigerPgFactHM(driver);
	driver.get("https://demo.vtiger.com/vtigercrm/");
	
	
	logRef.username("admin");
	logRef.password("Test@123");
	logRef.login();
}
}
