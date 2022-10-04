package Coordinates;
//IN selenium Y co-ordinate increases top to Bottom 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1000);
	WebElement error = driver.findElement(By.cssSelector("#ErrorsTable span[class='errormsg']"));
	System.out.println("Colour Of Msg:"+error.getCssValue("color"));
	System.out.println("text:"+error.getText());
	
	//location
	Point locOfErrormsg = error.getLocation();
	int erX = locOfErrormsg.getX();
	int erY = locOfErrormsg.getY();
	System.out.println("x co-oridnate of error msg:"+ erX);
	System.out.println("y co-oridnate of error msg:"+ erY);
	System.out.println("************************************************************");
	Thread.sleep(1000);
	WebElement username = driver.findElement(By.id("username"));
	Point locOfUsername = username.getLocation();
	int unX =locOfUsername.getX();
	int unY =locOfUsername.getY();
	System.out.println("x co-oridnate of Username:"+unX);
	System.out.println("y co-oridnate of Username:"+unY);
	
	System.out.println("Is errorMSG top of the Username:"+(erY<unY));
	System.out.println("************************************************************");
// also we get a location without using Point
	int pwdY = driver.findElement(By.name("pwd")).getLocation().getX();
	
}
}
