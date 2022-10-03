package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
 ChromeDriver cdriver =new  ChromeDriver();
 cdriver.get("https://www.google.com");
 cdriver.close();
}
}