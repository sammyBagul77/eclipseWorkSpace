package extentRepo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;

public class example1 extends SeleniumUtility{
	static ExtentReports report;
	static ExtentTest test;
@BeforeTest
public void startTest() {
	report = new ExtentReports("C:\\Users\\Lenovo\\eclipse-workspace\\TestNGProject\\ExtentReport\\ExtentReportresults.html");
	test= report.startTest("GoogleReport");
}

@Test
public void demo() throws IOException {
	WebDriver driver = setUp("chrome","https://www.google.com");
	
	if(driver.getTitle().equals("Google")){
		test.log(LogStatus.PASS,test.addScreenCapture(screenShot(driver)),"Navigated to the specified URL successfully and page tile is also validated");
	}else {
		test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver)), "Google page validation got failed");
		Assert.assertTrue(driver.getTitle().equals("Google"));
	}
	driver.close();
}
@Test
public void demo1() throws IOException {
	WebDriver driver = setUp("chrome","https://www.google.com");
	
	if(driver.getTitle().equals("Google1")){
		test.log(LogStatus.PASS, test.addScreenCapture(screenShot(driver)),"Navigated to the specified URL successfully and page tile is also validated");
	}else {
		test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver)), "Google page validation got failed");
		Assert.assertTrue(driver.getTitle().equals("Google"));
	}
	driver.close();
}
@AfterClass
public static void endTest() {
	report.endTest(test);
	report.flush();
}

public static String screenShot(WebDriver driver) throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()+ ".png");
	String errflpath = Dest.getAbsolutePath();
	FileUtils.copyFile(scrFile, Dest);
	return errflpath;
	}
}
