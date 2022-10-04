package parctDDT;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utility.SeleniumUtility;

public class practiceDDT extends ExcelUtility {
	String appUrl;
	String userName;
	String Password;
	
	@BeforeMethod
	public void preData() throws IOException {
	appUrl =ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\testFile.xlsx","Sheet1",2,0);
	userName =ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\testFile.xlsx","Sheet1",2,1);
	Password =ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\testFile.xlsx","Sheet1",2,2);
	}
	
	@Test
	public void getData() {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome",appUrl);
		WebElement user = driver.switchTo().activeElement();
		user.clear();
		user.sendKeys(userName,Keys.TAB);
		WebElement pass = driver.switchTo().activeElement();
		pass.clear();
		pass.sendKeys(Password,Keys.ENTER);
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\testFile.xlsx","Sheet1",2,3,"Passed");
	 
}
}