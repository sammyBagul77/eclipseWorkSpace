package testNgPackage;

import org.testng.annotations.Test;

import utility.SeleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class dataPro_Implimentation {
  @Test(dataProvider = "testData")
  public void impliment(String browser, String username, String password) {
	 SeleniumUtility s1 =new SeleniumUtility();
	 WebDriver driver = s1.setUp(browser, "https://demo.actitime.com/login.do");
	 driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		String expTitle = "actiTIME - Enter Time-Track";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Logout']")));
		String actTitle = driver.getTitle();
		Assert.assertEquals(expTitle,actTitle);
  }

  @DataProvider(name ="testData")
  public Object[][] getdata(){

		Object[][] data = new Object[3][3];
		// first row
		data[0][0] = "chrome";
		data[0][1] = "admin";
		data[0][2] = "manager";

		// 2nd row
		data[1][0] = "firefox";
		data[1][1] = "admin";
		data[1][2] = "123";

		// 3rd row
		data[2][0] = "chrome";
		data[2][1] = " ";
		data[2][2] = "Test@123";
		
		return data;

	}

  }

