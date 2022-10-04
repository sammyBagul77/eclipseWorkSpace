package RepoPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.SeleniumUtility;

public class leadRepo {
	WebDriver driver;

	public leadRepo(WebDriver d) {
		this.driver = d;

		PageFactory.initElements(driver, this);
	}

	SeleniumUtility s1 = new SeleniumUtility();
	@FindBy(css = ".fa.fa-plus:nth-of-type(1)")
	private WebElement AddLead;

	@FindBy(className = "select2-arrow")
	private WebElement dropDown;

	@FindBy(xpath = "//*[@id='select2-results-2']/li[2]")
	WebElement selectOP;

	@FindBy(css = "#Leads_editView_fieldName_firstname")
	WebElement FirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobNo;

	@FindBy(xpath = "//*[text()='Save']")
	private WebElement save;

	public void addL(String firstName, String lastName, String MobileNo) throws InterruptedException {
		AddLead.click();

		dropDown.click();
		Thread.sleep(500);
		selectOP.click();
		FirstName.sendKeys(firstName, Keys.TAB);
		LastName.sendKeys(lastName);
//			mobNo.click();
		mobNo.sendKeys(MobileNo);
		save.click();
	}

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
	private WebElement deleteDrop;

	@FindBy(xpath = "//*[text()='Delete Lead']")
	private WebElement delLead;

	@FindBy(xpath = "//button[@* ='confirm']")
	private WebElement delConfirm;

	public void moreDrop() {
		s1.visibilityWait(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
		deleteDrop.click();
		delLead.click();
	}

	public void deleteConfirm() throws InterruptedException {
		s1.waitTillElementIsClickable(delConfirm);
		delConfirm.click();
	}

}
