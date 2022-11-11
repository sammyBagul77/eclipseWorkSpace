package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import WebPagesClass.cartPage;
import WebPagesClass.listOfProducts;
import WebPagesClass.searchWebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumUtility;

public class flipkartMain extends SeleniumUtility {
	WebDriver driver;
	searchWebPage webPageObj;
	WebDriverWait wait;
	listOfProducts liProduct;
	cartPage cartQ;

	@Given("^User already on HomePage$")
	public void user_already_on_homepage() {
		driver = setUp("chrome", "https://www.flipkart.com/");
		String actTitle = driver.getTitle();
		String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(actTitle, expTitle);

	}

	@When("^User click on searchBox and Enter (.+)$")
	public void user_click_on_searchbox_and_enter(String productname) {
		webPageObj = new searchWebPage(driver);
		webPageObj.search(productname);

	}

	@Then("^User should able to see list of (.+) on WebPage$")
	public void user_should_able_to_see_list_of_on_webpage(String productname) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(productname));
		Assert.assertTrue(driver.getTitle().contains(productname));

	}

	@When("^User click on any product$")
	public void user_click_on_any_product() throws InterruptedException {
		liProduct = new listOfProducts(driver);
		Thread.sleep(1000);
		liProduct.selectProduct();
	}

	@Then("^He should get navigated on that product page$")
	public void he_should_get_navigated_on_that_product_page() {
		liProduct.navigateTo();
	}

	@And("^User should be able to add the product to the cart$")
	public void user_should_be_able_to_add_the_product_to_the_cart() {
		liProduct.addingProductTocart();

	}

	@And("^ User should be able to see quanitity of product added to the cart$")
	public void user_should_be_able_to_see_quanitity_of_product_added_to_the_cart() throws InterruptedException {
		cartQ = new cartPage(driver);
		cartQ.quantity();
		driver.quit();
	}

}
