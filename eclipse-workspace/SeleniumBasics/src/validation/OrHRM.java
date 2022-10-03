package validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrHRM {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
		f1.get("https://opensource-demo.orangehrmlive.com");
		f1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Username validation 
		WebElement username = f1.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
         System.out.println("webelement is displayed or not:" + username.isDisplayed()); 
         System.out.println("webelement is functioning or not:" + username.isEnabled()); 
        
        //password validation
         WebElement password = f1.findElement(By.name("txtPassword"));
         password.sendKeys("admin123");
         System.out.println("element is diplayed or not: "+password.isDisplayed());
         System.out.println("element is functioning  or not: "+password.isEnabled());
	
         //login Validation
         WebElement login = f1.findElement(By.id("btnLogin"));
         System.out.println(login.isDisplayed());
         System.out.println(login.isEnabled());
         System.out.println(login.getAttribute("value"));
         
         //keep me login
         WebElement forgot = f1.findElement(By.id("forgotPasswordLink"));
         System.out.println(forgot.isDisplayed());
         System.out.println(forgot.isEnabled());
         System.out.println(forgot.isSelected());
         
         login.click();

         
     
	}
}
/**
 * Username input field:
 * 			1. display
 * 			2. editable
 * 			3. default
 * Login button:
 * 			1. display
 * 			2. functional
 * 			3. button name
 * Keep me logged in check-box/radio button:
 * 			1. display
 * 			2. functional
 * 			3. selection
 * link:
 *			1. display
 * 			2. functional
 * 			3. link name
 * dropdown:
 * 			1. display
 * 			2. functional
 * 			3. default value
 * 			4. change value is reflecting or not
 * 			5. total option
 * 			6. multi select 
 * 
 * isDisplayed() --> To check visibility of any WebElement we can user this
 * 				true --> display/visible
 * 				false--> not displayed / not visible
 * isEnabled() ---> to check whether the WebElemenet is functional or not
 * 				true --> editable/functional
 * 				false --> non editable/non-functional
 * isSelected()---> to check whether radio button/check box is selected or not
 * 				true ---> selected
 * 				false---> not selected
 * getAttribute("attribute_name")--> use to get the attribute name which is passed in
 * 									 this method as parameter in form String
 * getText()--> give the inner text for the WebElement from HTML
 * 
 *	<p> inner text</p>
 *	<a...> inner text</a>
 *	<div..> inner text</div>
 */	