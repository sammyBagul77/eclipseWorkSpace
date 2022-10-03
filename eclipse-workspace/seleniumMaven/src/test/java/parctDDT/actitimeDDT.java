package parctDDT;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utility.SeleniumUtility;

public class actitimeDDT {
	String appUrl;
	String userName;
	String password;

	@BeforeTest
	public void getData() {
		appUrl = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\testFile.xlsx", "Sheet1", 1, 0);
		userName = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\testFile.xlsx", "Sheet1", 1, 1);
		password = ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\testFile.xlsx", "Sheet1", 1, 2);
	}

	@Test
	public void actitimeLogin() {
		SeleniumUtility s1 =new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", appUrl);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\testFile.xlsx", "Sheet1", 2, 3,"Passed");
	}
}
