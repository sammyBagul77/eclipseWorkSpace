package RepoPom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class actitimeLog_Repo extends SeleniumUtility {
	WebDriver driver;

	public actitimeLog_Repo(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ("input#username"))
	private WebElement userName;

	@FindBy(name = ("pwd"))
	private WebElement passWord;

	public void login(String uId, String pass) {
		typeInput(userName, uId);
		typeInput(passWord, pass);
		passWord.sendKeys(Keys.ENTER);
	}

}
