package Keyboard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registrPg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// identifying the first name element
		WebElement firstname = driver.findElement(By.xpath("//input[ @ng-model='FirstName']"));
		Thread.sleep(2000);
		firstname.sendKeys("Samarth", Keys.chord(Keys.CONTROL, "a"));// selecting first name cntrl +a
		// copying first name cntrl +c
		firstname.sendKeys(Keys.CONTROL, "c");
		// Last Name
		WebElement lastname = driver
				.findElement(By.cssSelector("div.form-group>div:nth-of-type(2)>input[ng-model='LastName']"));
		lastname.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		Thread.sleep(2000);
		lastname.clear();
		Thread.sleep(1000);
		lastname.sendKeys("Bagul");

		// Address
		driver.findElement(By.cssSelector(".form-group:nth-of-type(2)>div>textarea"))
				.sendKeys("Girna Pumping Road Jalgaon", Keys.TAB);

		// emailAddress
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sam@gmail.com", Keys.TAB);

		// phone
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".form-group:nth-of-type(4)>div>input[type='tel']")).sendKeys("1234567894",
				Keys.TAB);

		// Gender
		driver.findElement(By.xpath("//input[@value='Male']")).sendKeys(Keys.SPACE, Keys.TAB);

		// Hobbies
		List<WebElement> hobby = driver.findElements(By.cssSelector(".form-group:nth-of-type(6)>div>div"));
		System.out.println("Hobbies:");
		for (WebElement h : hobby) {
			System.out.println(h.getText());
		}
		driver.findElement(By.cssSelector(".form-group:nth-of-type(6)>div>div>input#checkbox1")).sendKeys(Keys.SPACE,
				Keys.TAB);
		driver.findElement(By.cssSelector(".form-group:nth-of-type(6)>div>div>input#checkbox2")).sendKeys(Keys.SPACE,
				Keys.TAB);
		driver.findElement(By.cssSelector(".form-group:nth-of-type(6)>div>div>input#checkbox3")).sendKeys(Keys.SPACE,
				Keys.TAB);
		System.out.println("************************************************");

		// Languages

		driver.findElement(By.id("msdd")).click();
		Thread.sleep(1000);
		List<WebElement> lang = driver.findElements(By.xpath("//div/multi-select/div[2]/ul/li/a"));
		for (WebElement l : lang) {
			System.out.println(l.getText());
		}
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@style='display: block;']/ul/li/a[text()='English']")).click();
		driver.findElement(By.xpath("//div[@style='display: block;']/ul/li/a[text()='Hindi']")).click();
		driver.findElement(By.xpath("//div[@style='display: block;']/ul/li/a[text()='Czech']")).click();
		driver.findElement(By.cssSelector("#section")).click();

		System.out
				.println("******************************************************************************************");
		// Skills
		WebElement skill = driver.findElement(By.cssSelector("#Skills"));
		skill.click();
		Select sklist = new Select(skill);
		List<WebElement> l1 = sklist.getOptions();
		for (WebElement w : l1) {
			System.out.println(w.getText());
		}
		sklist.selectByIndex(11);
		driver.findElement(By.cssSelector("#section")).click();

		// Select Countries
		driver.findElement(By.cssSelector("#countries>option")).click();
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India", Keys.ENTER);
		System.out.println("******************************************************************************************");
		//DOB
			//year
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.cssSelector("#yearbox"));
		year.click();
		Select yearOp = new Select(year);
		List<WebElement> yea = yearOp.getOptions();
		for (WebElement y : yea) {
			System.out.println(y.getText());
		}
		yea.get(82).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("#section")).click();
     	System.out.println("******************************************************************************************");
         	// Month
         Thread.sleep(2000);
 		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
 		month.click();
 		Select monthOp = new Select(month);
 		List<WebElement> mon = monthOp.getOptions();
 		for (WebElement m : mon) {
 			System.out.println(m.getText());
 		}
 		mon.get(6).click();
          Thread.sleep(1000);
          driver.findElement(By.cssSelector("#section")).click();
      	System.out.println("******************************************************************************************");
      		//day
      	WebElement day = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
 		day.click();
 		Select dayOp = new Select(day);
 		List<WebElement> da = dayOp.getOptions();
 		for (WebElement d : da) {
 			System.out.println(d.getText());
 		}
 		da.get(25).click();
          Thread.sleep(1000);
          driver.findElement(By.cssSelector("#section")).click();
          
       //password
          driver.findElement(By.cssSelector("#firstpassword")).sendKeys("sam@123", Keys.chord(Keys.CONTROL,"c"),Keys.TAB);
          driver.findElement(By.cssSelector("#secondpassword")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
          
      //Submit
          WebElement submit = driver.findElement(By.cssSelector("#submitbtn"));
          System.out.println(submit.getCssValue("background-color"));
          submit.click();
          
	}
}
