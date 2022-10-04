package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.SeleniumUtility;

public class example2 {
public static void main(String[] args) throws IOException {
//	System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
//	ChromeDriver driver =new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver.manage().window().maximize();
//	
	SeleniumUtility s1 = new SeleniumUtility();
	WebDriver driver = s1.setUp("chrome","https://www.facebook.com/");
//	driver.get("https://www.facebook.com/");
	
	TakesScreenshot tc =(TakesScreenshot) driver;
	
	File scShot = tc.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(scShot,new File(".\\ScreenShots\\fbSSshot.png"));
}
}
