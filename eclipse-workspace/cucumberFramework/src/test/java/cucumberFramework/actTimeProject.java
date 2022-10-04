package cucumberFramework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import RepoPom.actiTaskPg_Repo;
import RepoPom.actitimeHM_Repo;
import RepoPom.actitimeLog_Repo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class actTimeProject extends SeleniumUtility {
    WebDriver driver;
    actitimeLog_Repo actLog;
    actitimeHM_Repo actHM;
    actiTaskPg_Repo actTask;
	 @Given("^User already on login page of Actitime$")
	    public void user_already_on_login_page_of_actitime()  {
	        driver =setUp("chrome", "https://demo.actitime.com/login.do");
	        actLog = new actitimeLog_Repo(driver);
	        actHM =new actitimeHM_Repo(driver);
	        actTask =new actiTaskPg_Repo(driver);
	    }

	    @When("^User should able to login with Username as (.+) and Password as (.+)$")
	    public void voidlogin_with_username_as_and_password_as(String username, String password)  {
	        actLog.login(username, password);
	    }
	    
	    @Then("^User can see Home Page of Actitime having Title (.+)$")
	    public void user_can_see_home_page_of_actitime_having_title(String title) throws InterruptedException {
	    	waitTillElementVisible(actHM.tasks);
	        Assert.assertTrue(driver.getTitle().contains(title));
	    }
	    
	    @And("^user able to click on menu element i.e Tasks$")
	    public void user_able_to_click_on_menu_element_ie_tasks(){
	        actHM.task();
	    }
	    
	    @When("^After clicking on Add new button user should add new task$")
	    public void after_clicking_on_add_new_button_user_should_add_new_task() {
	    	actTask.taskActivity();
	  
	    }
	    
	    @Then("^User also able to add task Name as (.+) and deadline$")
	    public void user_also_able_to_add_task_name_as_and_deadline(String task) throws InterruptedException {
	        actTask.taskCreation(task);
	        actTask.taskDeletion();
	    }
	    
	    @And("^user can logout after task deletion and logout$")
	    public void user_can_logout_after_task_deletion() {
	        actTask.logOut();
	        driver.close();
	    }
	}

