package CssAttributePath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssValue {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
	
	FirefoxDriver f = new FirefoxDriver();
	f.get("https://demo.vtiger.com/vtigercrm/index.php");
	f.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement Button = f.findElement(By.cssSelector("button[type='submit']"));
	String fBackColor = Button.getCssValue("background-image");
	String fColor = Button.getCssValue("color");
	String fsize = Button.getCssValue("font-size");
	String fBoxHeight =Button.getCssValue("line-height");
	
	System.out.println("Font Background Colour: "+fBackColor);
	System.out.println("Font Colour: "+fColor);
	System.out.println("Font Background Colour: "+fsize);
	System.out.println("Font box height: "+ fBoxHeight);
	System.out.println(Button.getCssValue("type"));
	System.out.println("***************************************************************");
	
	WebElement forgot = f.findElement(By.cssSelector("a[class=forgotPasswordLink]"));
	System.out.println("Forgot Password Size:"+ forgot.getCssValue("font-size"));
	
	
}
}
