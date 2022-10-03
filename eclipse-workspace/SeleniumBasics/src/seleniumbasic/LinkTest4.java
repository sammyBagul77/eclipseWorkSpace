package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		String ExpectedLink="https://demo.automationtesting.in/Register.html";
		String ActualLink= driver.getCurrentUrl();
	if(ActualLink.contains(ExpectedLink)) {
		System.out.println("Both Links Are Same");
	}else {
		System.out.println("Both Links Are Not Same");
	}
		String ExpectedTitle="Register";
		String ActualTitle= driver.getTitle();
		System.out.println("Both Titles Are Same? -> "+ActualTitle.equals(ExpectedTitle));
		System.out.println("Page length:" + driver.getPageSource().length());
		
	}

}
