package POM_ActiLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vTigerPgFactHM {

	WebDriver driver;
	
	vTigerPgFactHM(WebDriver d){
		driver =d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(css="#password")
	WebElement passWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public void username(String name) {
		userName.click();
		userName.clear();
		userName.sendKeys(name);
	}
	
	public void password(String pword) {
		passWord.click();
		passWord.clear();
		passWord.sendKeys(pword);
	}
	
	public void login() {
		submit.click();
	}
}
