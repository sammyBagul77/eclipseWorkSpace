package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest3 {

	public static void main(String[] args) {
		String gProperty= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", gProperty+"\\Executables\\chromedriver.exe");
		
			WebDriver d1 = new ChromeDriver();
			d1.get("https://opensource-demo.orangehrmlive.com/");
			String ExpLink="https://opensource-demo.orangehrmlive.com/";
			String ActLink=d1.getCurrentUrl();
			System.out.println("Both Links Are Same--> "+ActLink.contains(ExpLink));
	String ExpTitle ="OrangeHRM";
	String ActTitle = d1.getTitle();
	System.out.println("Both Title Are Same--> "+ActTitle.contains(ExpTitle));
	System.out.println("Page Src Length: " +d1.getPageSource().length());
	d1.close();
	}

}
