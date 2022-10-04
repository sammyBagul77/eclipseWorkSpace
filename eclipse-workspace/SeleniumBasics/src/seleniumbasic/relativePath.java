package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class relativePath {

	public static void main(String[] args) {
		String UserDir = System.getProperty("user.dir");
		System.out.println(UserDir);
		
//		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");//---> relativePath
		System.setProperty("webdriver.chrome.driver",UserDir+"\\Executables\\chromedriver.exe");//-->Abspath
		ChromeDriver driver = new ChromeDriver();
		 driver.get("Https://www.google.com/");
		 driver.close();
	}

}
