package POM_ActiLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest_acti {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	// creating the object of loginPg_repo_acti
	loginPgRepo_acti logpg =new loginPgRepo_acti(driver);
	driver.get("https://demo.actitime.com/login.do");
	
	logpg.userName("admin");
	logpg.passWord("manager");
	logpg.login();
}

}
