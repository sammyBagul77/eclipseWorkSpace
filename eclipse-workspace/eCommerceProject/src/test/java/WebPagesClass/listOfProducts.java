package WebPagesClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class listOfProducts {
	WebDriver driver;
	public  listOfProducts(WebDriver driver) {
	        this.driver =driver;
	        
	       PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="div>div:nth-of-type(3)>div:nth-of-type(1)>div:nth-of-type(2) div:nth-of-type(2) ._13oc-S ._2kHMtA>._1fQZEK")
	private WebElement FirstProduct;

	@FindBy(css ="._2KpZ6l._2U9uOA._3v1-ww")
	private WebElement addToCart;
	
	
	String  currentWindow;
	public void selectProduct() {
		  currentWindow = driver.getWindowHandle();
		 
			 FirstProduct.click();
	}
	
  public void navigateTo() {
	 Set<String> allWindows =  driver.getWindowHandles();
	 allWindows.remove(currentWindow);
	 
	 
	 Iterator<String>itr = allWindows.iterator();
	 String childWind =itr.next();
	 
	 driver.switchTo().window(childWind);
	  
	 Assert.assertTrue(addToCart.isDisplayed());
  }
  
  public void addingProductTocart() {
	  addToCart.click();
  }


}
