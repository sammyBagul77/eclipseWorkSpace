package extentRepo;

import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Throwables;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter.Config;
import com.relevantcodes.extentreports.LogStatus;

import utility.SeleniumUtility;

public class example2 extends SeleniumUtility {
    
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeTest
	public void store() {
		report = new ExtentReports("C:\\Users\\Lenovo\\eclipse-workspace\\TestNGProject\\ExtentReport\\newReport.html");
		report.addSystemInfo("Host Name", "Samarth");
	    report.addSystemInfo("Environment", "Dev");
	    report.addSystemInfo("User Name", "SammyBagul");
	 
	}
	@Test
	public void test1() {
		
         test = report.startTest("passTest");
         
         Assert.assertTrue(true);
         test.log(LogStatus.PASS, "First Test Passed");
	}
	
	@Test
	public void test2()
	{
		test =report.startTest("failTest");
		Assert.assertTrue(false);
		test.log(LogStatus.PASS, "Second test Passed");
	}	
	
	@Test
	public void test3() {
		test =report.startTest("skipTest");
		throw new SkipException("Testcase is not ready for testing");
	}
	
	@AfterMethod
	public void resultMeth(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(LogStatus.FAIL,"TestCase Failed Name:"+ result.getName());
			test.log(LogStatus.FAIL, "TestCase Failed Due To"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP){
			test.log(LogStatus.SKIP,"TestCase Skip Name:"+ result.getName());
			
		}
	     report.endTest(test);
	}
	@AfterTest
	public void endReport() {
		report.flush();
		report.close();
		
	}
}
