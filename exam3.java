package extentRepo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;

public class exam3 {
	
	ExtentReports reports ;
	ExtentTest test;
	WebDriver driver;
	
	@BeforeMethod
	public void befTest() {
		reports = new ExtentReports("C:\\Users\\Lenovo\\eclipse-workspace\\TestNGProject\\ExtentReport\\makeMyTrip.html");
		test =reports.startTest("Make MY Trip Application");
	
	}

	
	@Test
	public void test() {
		
		SeleniumUtility s1 =new SeleniumUtility();
		driver = s1.setUp("chrome", "https://www.makemytrip.com/");
		WebElement SearchBtn = driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
		if(SearchBtn.isDisplayed()) {
			test.log(LogStatus.PASS, "Search Btn is visible");
			
		}else {
			test.log(LogStatus.FAIL, "Element Not Found");
		}

		
	}
	
	@Test
	public void test2() throws IOException {
	
		WebElement SearchBtn1 = driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
		if(SearchBtn1.isSelected()) {
			test.log(LogStatus.PASS, "Search Btn is visible");
			
		}else {
			test.log(LogStatus.FAIL, test.addScreenCapture(scShot(driver)),"Element not Selected");
		}

	}
	
	@AfterMethod
public void afterMethod() {
	reports.endTest(test);
}
	
	@AfterTest
	public void afterTest() {
		reports.flush();
		reports.close();
	}
	
	
	public String scShot( WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\TestNGProject\\BStackImages\\makeMyTrip"+System.currentTimeMillis()+".png") ;
		String errPath = dest.getAbsolutePath();
		FileUtils.copyFile(src, dest);
		return errPath;
		
	}
}
