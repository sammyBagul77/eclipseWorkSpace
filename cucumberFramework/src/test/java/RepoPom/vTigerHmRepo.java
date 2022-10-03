package RepoPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class vTigerHmRepo {
	WebDriver driver;
	SeleniumUtility s1 = new SeleniumUtility();

	public vTigerHmRepo(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#appnavigator>div>.app-icon")
	private WebElement dashBoard;

	public void dropDown() {
		dashBoard.click();
	}

	@FindBy(css = "#MARKETING_modules_dropdownMenu > div > span.app-name.textOverflowEllipsis")
	private WebElement Marketing;

	@FindBy(xpath = "//span[text()=' Leads'] ")
	private WebElement lid;

	// below statement is not the part of page factory
	By lead = By.xpath("//span[text()=' Leads'] ");

	public void market() throws InterruptedException {
		Thread.sleep(500);
		Marketing.click();

	}

	public void lead() {

		s1.visibilityWait(lead);
		lid.click();
	}

}
