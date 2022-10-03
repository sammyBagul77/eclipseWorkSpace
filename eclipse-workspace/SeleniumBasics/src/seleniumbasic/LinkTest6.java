package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String ExpectedLink="http://www.amazon.in";
		String ActualLink= driver.getCurrentUrl();
	if(ActualLink.contains(ExpectedLink)) {
		System.out.println("Both Links Are Same");
	}else {
		System.out.println("Both Links Are Not Same");
	}
		String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String ActualTitle= driver.getTitle();
		System.out.println("Both Titles Are Same? -> "+ActualTitle.equals(ExpectedTitle));
		System.out.println("Page length: " + driver.getPageSource().length());
		driver.close();
		
	}
}
