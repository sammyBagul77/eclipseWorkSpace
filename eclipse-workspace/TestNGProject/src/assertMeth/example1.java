package assertMeth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility;

@Test
public class example1 {
  public void titleValidation(){
	  SeleniumUtility s1 = new SeleniumUtility();
	  WebDriver driver = s1.setUp("chrome", "https://demo.actitime.com/login.do");
	  String expTitle ="actiTIME - Login";
	  String actTitle = driver.getTitle();
//	  Assert.assertEquals(expTitle, actTitle);
//	  OR
	  Assert.assertEquals(expTitle, actTitle,"Title didn't Match");
	  System.out.println("Current Url:" + driver.getCurrentUrl());
	 WebElement subButton= driver.findElement(By.xpath("//div[text()='Login ']"));
//	 Assert.assertTrue(subButton.isSelected(),"notSelected");
	 Assert.assertFalse(subButton.isDisplayed(),"it is diplayed");
	 driver.quit();
	
  }
}
