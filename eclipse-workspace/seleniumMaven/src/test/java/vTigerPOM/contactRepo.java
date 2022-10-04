package vTigerPOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumUtility;

public class contactRepo {
	WebDriver driver;
	SeleniumUtility s1 = new SeleniumUtility();

	contactRepo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#Contacts_listView_basicAction_LBL_ADD_RECORD")
	WebElement addContact;

	@FindBy(css = ".select2-arrow:nth-of-type(2)")
	WebElement firstName;

	@FindBy(css = ".select2-input.ignore-validation")
	WebElement Input;

	@FindBy(css = "#Contacts_editView_fieldName_lastname")
	WebElement lastName;

	@FindBy(css = "#Contacts_editView_fieldName_mobile")
	WebElement num;

	@FindBy(xpath = "//*[@id='EditView']/div[3]/div/div/button")
	WebElement save;

	public void addC(String firstname, String lastname, String mobNo) throws InterruptedException {
		s1.waitTillElementVisible(addContact);
		addContact.click();
		firstName.click();
		Thread.sleep(500);
		Input.sendKeys("Mr.", Keys.ENTER, Keys.TAB, firstname, Keys.TAB);
		lastName.sendKeys(lastname);
		s1.waitTillElementVisible(num);
		num.click();
		num.sendKeys(mobNo);
		save.click();
	}

	@FindBy(xpath = "//div/div[1]/button[4]")
	WebElement More;

	@FindBy(xpath = "	//*[text()='Delete Contact']")
	WebElement delete;

	@FindBy(xpath = "	//*[text()='Yes']")
	WebElement confirm;
	public void deleteContact() {
		s1.waitTillElementVisible(More);
		More.click();
		delete.click();
		confirm.click();
		
		 
	}
	
	@FindBy(xpath = "//span[@class='fa fa-user']")
	WebElement userLogOut;
	
	@FindBy(xpath = "	//*[text()='Sign Out']")
	WebElement logOut;
	
	public void signOut() {
		s1.waitTillElementVisible(userLogOut);
		userLogOut.click();
		logOut.click();
	}
}
