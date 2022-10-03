package cucumberFramework;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import RepoPom.leadRepo;
import RepoPom.vTigerHmRepo;
import RepoPom.vTigerLoginRepo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class vTigerProject_StepDefination extends SeleniumUtility {
	WebDriver driver;
	vTigerLoginRepo login;
	vTigerHmRepo hm;
	leadRepo lead;
    @Given("^Chrome browser should open and user should on Vtiger Page$")
    public void chrome_browser_should_open_and_user_should_on_vtiger_page() {
      driver= setUp("chrome", "https://demo.vtiger.com/vtigercrm/");
      login = new vTigerLoginRepo(driver);
      hm = new vTigerHmRepo(driver);
      lead = new leadRepo(driver);
    }

    @When("^User enters username and password as and Enter$")
    public void user_enters_username_as_and_password_as_and_enter()  {
       login.loginCred("admin", "Test@123");
    }

    @Then("^User should navigate on vTiger Homepage$")
    public void user_should_navigate_on_vtiger_homepage()  {
    	Assert.assertFalse(driver.getTitle().contains("Board"));
    }
    

    @When("^User clicks on dashBoard menu and clicks on Marketing$")
    public void user_clicks_on_dashboard_menu_and_clicks_on_marketing() throws InterruptedException {
    	hm.dropDown();
            hm.market();
    }

    @Then("^User able to click lead in list and able to see lead page$")
    public void user_able_to_see_lead_in_list_and_user_able_to_click_on_it() {
       hm.lead();
       
    }
    @And("^user should create new lead after clicking on add lead$")
    public void user_should_create_new_lead_after_clicking_on_add_lead() throws InterruptedException  {
     lead.addL("Champak", "Jetha", "3812030122");
    }

    @When("^User clicks on More Dropdown and Click on delete lead$")
    public void user_clicks_on_more_dropdown_and_click_on_delete_lead() {
    lead.moreDrop();
    }

    @Then("^User should be able to delete the lead$")
    public void user_should_be_able_to_delete_the_lead() throws InterruptedException {
     lead.deleteConfirm();
    }
}
