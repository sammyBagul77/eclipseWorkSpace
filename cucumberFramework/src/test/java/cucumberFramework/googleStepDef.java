package cucumberFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class googleStepDef extends SeleniumUtility {
	WebDriver driver;

	@Given("^user already on google search page$")
	public void user_already_on_google_search_page() {
		driver = setUp("chrome", "https://www.google.com/");
	}

	@When("^user type the (.+)  in google search box and enter the key$")
	public void user_type_the_something_in_google_search_box_and_enter_the_key(String data) {
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(data, Keys.ENTER);
	}

	@Then("^user should be able to get result page of title (.+)$")
	public void user_should_be_able_to_get_result_page_of_title_something(String title){
		Assert.assertTrue(driver.getTitle().contains("selenium"));
	}

	@And("^driver close$")
	public void closeBrowser() {
		cleanUp();
	}

}
