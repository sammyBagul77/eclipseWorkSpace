package POM_ActiLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//without page factory
public class loginPgRepo_acti {
	WebDriver driver;
	
	loginPgRepo_acti(WebDriver d){
		
		driver = d;
	}
	
	By username = By.id("username");
	By password = By.name("pwd");
	By loginBtn = By.id("loginButton");
	
	public void userName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void passWord(String pword) {
		driver.findElement(password).sendKeys(pword);
		
	}
	public void login() {
		driver.findElement(loginBtn).click();
	}
}
