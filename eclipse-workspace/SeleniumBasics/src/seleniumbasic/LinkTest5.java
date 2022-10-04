package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/");
		String ExpectedLink="http://sampleapp.tricentis.com/101/";
		String ActualLink= driver.getCurrentUrl();
	if(ActualLink.contains(ExpectedLink)) {
		System.out.println("Both Links Are Same");
	}else {
		System.out.println("Both Links Are Not Same");
	}
		String ExpectedTitle="Tricentis Vehicle Insurance";
		String ActualTitle= driver.getTitle();
		System.out.println("Both Titles Are Same? -> "+ActualTitle.equals(ExpectedTitle));
		System.out.println("Page length: " + driver.getPageSource().length());
		driver.close();
		
	}
}
