package vTigerPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

public class vTigerHmpage extends SeleniumUtility {
	WebDriver driver = null;
	leadRepo l2;
     vTigerHmRepo hm;
     loginRepo l1;
     contactRepo c1;
	@Test(priority = 1)
	public void login() throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();

		driver = s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/");
		 l1 = new loginRepo(driver);
		l1.loginCred("admin", "Test@123");
		// TitleValidation
		Assert.assertEquals(driver.getTitle(), "Dashboard", "Dasboard Verification Failed");
		
		hm = new vTigerHmRepo(driver);
		// dashBoard
		hm.dropDown();
		hm.lead();
	}

	// Lead Creation
	@Test(priority = 2)
	public void lead() {
		// leadPg Object
		l2 = new leadRepo(driver);
		l2.addL("Champak", "Jetha", "1234567890");
		Assert.assertFalse(driver.getTitle() == "Leads");
		System.out.println("Current Title:" + driver.getTitle());
	}

	// Lead delete
	@Test(priority = 3)
	public void leadDelete() throws InterruptedException {
		l2 = new leadRepo(driver);
		l2.deleteLead();
		l2.dropDown();
	}
	
	//Contact Creation
	@Test(priority =4)
	public void contactCreation() throws InterruptedException {
		
		hm =new vTigerHmRepo(driver);
		hm.dropDown();
		Thread.sleep(500);
		hm.Contact();
		c1 = new contactRepo(driver);
		c1.addC("Daya","Waan","21830129323");
		
	}
	
	// Contact delete
		@Test(priority = 5)
		public void contactDelete() throws InterruptedException {
			c1 = new contactRepo(driver);
			c1.deleteContact();
			c1.signOut();
		}

	@AfterClass
	public void endTest() {
		cleanUp();
	}
}
