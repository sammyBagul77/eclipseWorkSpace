package utility;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.internal.ws.developer.MemberSubmissionEndpointReference.Elements;

public class SeleniumUtility {
	public static WebDriver driver = null;
	public static Actions action = null;
	public WebDriverWait wait;
	public static Select dropdown = null;

	public WebDriver setUp(String browserName, String appUrl) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			// use setup method of WebDriverManager
			// WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
			// step2: create an instance of Chrome Browser
			driver = new ChromeDriver();
		}
//		else if (browserName.equalsIgnoreCase("ie")) {
//			// use setup method of WebDriverManager
//			// WebDriverManager.iedriver().setup();
//			System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
//			// step2: create an instance of Chrome Browser
//			driver = new InternetExplorerDriver();
//		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			// use setup method of WebDriverManager
			// WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumBasics\\Executables\\geckodriver.exe");
			// step2: create an instance of Chrome Browser
			driver = new FirefoxDriver();
		}
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		driver.get(appUrl);
		action = new Actions(driver);
		return driver;
	}

	public void performClick(WebElement element) {
		element.click();
	}

	public void typeInput(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public String getcurrentWorkingDirectry() {
		String currentDir = System.getProperty("user.dir");
		return currentDir;
	}

	public void copyTextFrmField(WebElement element) {
		action.doubleClick(element).perform();
		element.sendKeys(Keys.chord(Keys.CONTROL, "c"));
	}

	public void pasteTextFrmField(WebElement element) {
		action.doubleClick(element).perform();
		element.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}

	public void waitTillElementIsClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

//public List<WebElement> getAllElements(String locatorType,String locatorValue){
//	//switch  case
//}

	public void takeScreenshot(String fileLocation) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenShot = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(screenShot, new File(fileLocation));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void performDranAndDrop(WebElement src, WebElement target) {
		action.moveToElement(src).dragAndDrop(src, target).build().perform();
	}

	public void cleanUp() {
		driver.close();
	}

	public void rightClick(WebElement option) {
		action.moveToElement(option).contextClick().build().perform();
	}

	public void mouseHoverWithCords(WebElement option, int x, int y) {
		action.moveToElement(option, x, y).perform();
	}

	public void mouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}

	public void doubleClick(WebElement element) {
		action.moveToElement(element).doubleClick().perform();
	}

//public void switchToRequiredFrameUsingName(String name) {
//	driver.switchTo().frame(name);
//}
//
//public void switchToRequiredFrameUsingWebElement(WebElement element) {
//	driver.switchTo().frame(element);
//}
//
//public void switchToRequiredFrameUsingIndex(int index) {
//	driver.switchTo().frame(index);
//}
//
//public void switchControlBackToMainPage() {
//	driver.switchTo().defaultContent();
//}
//
//public WebElement getActiveElement() {
//	return driver.switchTo().activeElement();
//}
//methods for select dropdown
	public void dropdownMulti(WebElement element) {
		dropdown = new Select(element);
		System.out.println("Dropdown is Multiple: " + dropdown.isMultiple());
	}

	public void dropfirst(WebElement element) {
		dropdown = new Select(element);
		WebElement text = dropdown.getFirstSelectedOption();
		System.out.println("First Option: " + text.getText());
	}

	public void dropList(WebElement element) throws InterruptedException {
	dropdown = new Select(element);
	List<WebElement> dropLi = dropdown.getOptions();
	System.out.println("Size of Dropdown List: "+ dropLi.size());
	  Thread.sleep(1000);
	for(int i =0;i<dropLi.size();i++) {
		System.out.println("Option "+i+": "+dropLi.get(i).getText());
	}

	}
	// title
	public void currentTitle() {
		driver.getTitle();
	}
	// currentUrl
	public void currentUrl() {
		driver.getCurrentUrl();
	}
	// attribute
	public void attribute(WebElement element, String text) {
		element.getAttribute(text);
	}
	// inner text
	public void innertext(WebElement element, String text) {
		element.getText();
		}
	// Window handling ---> not now
	// Alert Handling ---> not now
	// calendar handling
}
