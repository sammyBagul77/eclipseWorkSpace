package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbsPath {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.get("Https://www.google.com/");
       driver.close();
}
}