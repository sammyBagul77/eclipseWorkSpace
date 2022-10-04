package vTigerPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class loginRepo {

	WebDriver driver;

	loginRepo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Sign in']")
	 private WebElement login;
	SeleniumUtility s1 = new SeleniumUtility();

	public void loginCred(String user, String pass) {
		username.click();
		username.clear();
		username.sendKeys(user);
		password.click();
		password.clear();
		password.sendKeys(pass);
		login.click();
	}

}
