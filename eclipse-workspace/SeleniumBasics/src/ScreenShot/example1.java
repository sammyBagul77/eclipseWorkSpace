package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class example1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//takessccreenshot interface
	
	TakesScreenshot ts =(TakesScreenshot) driver;
	File scShot = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scShot,new File(".\\ScreenShots\\googlesc.png"));
	
	
}
}
