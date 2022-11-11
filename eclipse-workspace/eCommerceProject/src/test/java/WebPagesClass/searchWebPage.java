package WebPagesClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchWebPage {
	
	WebDriver driver;
	
       public searchWebPage(WebDriver driver){
    	       this.driver =driver;
    	       
    	       PageFactory.initElements(driver, this);
       }
       
       
       @FindBy(xpath ="//body")
      private WebElement hmPageBody;
       
       @FindBy (className ="_3704LK")
      private WebElement searchBox;
       
      
       
       
       
       public void search(String product) {
    	   hmPageBody.sendKeys(Keys.ESCAPE);
    	   searchBox.click();
    	   searchBox.sendKeys(product,Keys.ENTER);
       }
       
}
