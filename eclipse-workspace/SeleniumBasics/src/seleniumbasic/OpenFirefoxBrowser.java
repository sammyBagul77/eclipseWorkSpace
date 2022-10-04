package seleniumbasic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumBasics\\Executables\\geckodriver.exe");
 FirefoxDriver fdriver =new FirefoxDriver ();
 fdriver.get("https://www.google.com");
// fdriver.close();
}
}
