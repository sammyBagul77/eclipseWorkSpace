package vTigerPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(className = "select2-choice")
	private WebElement FirstName;

//	@FindBy(xpath="//*[@id='select2-results-2']/li[2]")
//	WebElement selectOP;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobNo;

	@FindBy(xpath = "//*[text()='Save']")
	private WebElement save;

	public void addL(String firstName, String lastName, String MobileNo) {
		AddLead.click();
		FirstName.click();
		FirstName.sendKeys("Mr.", Keys.ENTER, Keys.TAB, firstName);
		LastName.sendKeys(lastName);
//		mobNo.click();
		mobNo.sendKeys(MobileNo);
		save.click();
	}

	@FindBy(xpath ="//button[@class='btn btn-default dropdown-toggle']")
	private WebElement deleteDrop;

	@FindBy(xpath = "//*[text()='Delete Lead']")
	private WebElement delLead;

	@FindBy(xpath = "//*[@*='confirm']")
	private WebElement delConfirm;
	
	public void deleteLead() throws InterruptedException {
	s1.visibilityWait(By.xpath("//button[@class='btn btn-default dropdown-toggle']"));
		deleteDrop.click();
		delLead.click();
		Thread.sleep(500);
		delConfirm.sendKeys(Keys.ENTER);	
	}
	
	@FindBy(css = "#appnavigator>div>.app-icon")
	private WebElement dashLi;

	 @FindBy(xpath ="//*[text()=' Dashboard']")
	 private WebElement dropBoard;
	 
	public void dropDown() throws InterruptedException {
		Thread.sleep(1000);
		dashLi.click();
		s1.waitTillElementVisible(dropBoard);
		dropBoard.click();
	}
	
}
