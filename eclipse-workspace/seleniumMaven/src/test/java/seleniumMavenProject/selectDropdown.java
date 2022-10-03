package seleniumMavenProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectDropdown {
public static void main(String[] args) throws InterruptedException {
//    System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");

	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	
	WebElement skills = driver.findElement(By.xpath("//select[@id ='Skills']"));
	
	Select skilldrop  = new Select(skills);
	System.out.println(skilldrop.getFirstSelectedOption().getText());
	System.out.println("Dropdown id Multiselect:"+ skilldrop.isMultiple());
//	skilldrop.getFirstSelectedOption();
	List<WebElement> dropLi = skilldrop.getOptions();
      
	List<String> list = new ArrayList<String>();
	for(int i =0; i<dropLi.size();i++){
		list.add(dropLi.get(i).getText());
	}
	
	for(String s: list) {
		System.out.println(s);
	}
	System.out.println("************************");
//	Collections.sort(list);
//	for(String s1: list) {
//		System.out.println(s1);
//	}
//	System.out.println("************************");
//	for(int i = list.size()-1;i>=0;i--) {
//		System.out.println(list.get(i));
//	}
//	

}
}
