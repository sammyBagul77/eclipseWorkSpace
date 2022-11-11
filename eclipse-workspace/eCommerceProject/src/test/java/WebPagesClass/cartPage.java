package WebPagesClass;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions act;

	public cartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text' and @class='_253qQJ']")
	private WebElement QuantityCount;

	@FindBy(xpath = "//body")
	private WebElement cPageBody;

	public void quantity() throws InterruptedException {
		wait = new WebDriverWait(driver, 20);
		Thread.sleep(2000);
//		js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
		act =new Actions(driver);
		for(int i= 0 ;i<2;i++) {
			cPageBody.sendKeys(Keys.PAGE_DOWN);
		}
//		act.moveToElement(QuantityCount).perform();
		wait.until(ExpectedConditions.elementToBeClickable(QuantityCount));
		String currentQuantity = QuantityCount.getCssValue("value");
		System.out.println("cQuantity :" + currentQuantity);
		
	}

}
