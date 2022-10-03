package Synchro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImExWai8 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//LoginpageURL
		String loginUrl ="https://demo.actitime.com/login.do";
		String curntUrl = driver.getCurrentUrl();
		System.out.println(loginUrl.equals(curntUrl));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		//LoginpageTitle
		String loginTitle = driver.getTitle();
		String ExpectedTitle = "actiTIME - Login";
		System.out.println(loginTitle.equals(ExpectedTitle));
		
		Thread.sleep(2000);//--> if we do not use this , then below statements will not get sufficient time and their validation will fail
		//Thread.sleep() if we are using this method then we will have to add throws InterruptedException in main method
		//HomepgUrlpageURL
		String HmUrl ="https://demo.actitime.com/user/submit_tt.do";
		String curtUrl = driver.getCurrentUrl();
		System.out.println(HmUrl.equals(curtUrl));
		
		//HomepageTitle
		String HmTitle = driver.getTitle();
		String ExpectTitle = "actiTIME - Enter Time-Track";
		System.out.println(HmTitle.equals(ExpectTitle));
		
		driver.findElement(By.id("logoutLink")).click();
	}

}
