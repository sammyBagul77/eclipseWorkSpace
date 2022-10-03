package seleniumbasic;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	String ExpectedLink="https://www.google.com/";
	String ActualLink= driver.getCurrentUrl();
	System.out.println("Actual URL: "+ ActualLink);
	System.out.println("Both Links Are Same? -> "+ActualLink.equals(ExpectedLink));
	String ExpectedTitle="Google";
	String ActualTitle= driver.getTitle();
	System.out.println("Both Titles Are Same? -> "+ActualTitle.equals(ExpectedTitle));
	System.out.println("Page length:" + driver.getPageSource().length());
}
}
