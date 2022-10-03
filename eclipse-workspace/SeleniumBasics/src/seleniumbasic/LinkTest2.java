package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".\\Executables\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String ExpectedResult= "https://www.facebook.com";
		String ActualResult = driver.getCurrentUrl();
		System.out.println("Both Links are matching-->"+(ActualResult.contains(ExpectedResult)));
		String ExpectedTitle= "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		System.out.println("Both Titles are matching-->"+(ActualTitle.equals(ExpectedTitle)));
		System.out.println("page src length: "+driver.getPageSource().length());
	
		driver.close();
	}

}
