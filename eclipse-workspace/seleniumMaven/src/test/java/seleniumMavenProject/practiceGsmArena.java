package seleniumMavenProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceGsmArena {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.gsmarena.com/");
		driver.findElement(By.xpath("//a[text()='Lenovo']")).click();

		List<WebElement> pagination = driver.findElements(By.xpath("//*[@class='nav-pages']/a"));
		System.out.println("No. of pagination Pages: " + pagination.size());
		if (pagination.size() > 1) {
			System.out.println("Pagination Exist");
		} else {
			System.out.println("Pagination is not exist");
		}
		
		// driver.findElement(By.cssSelector(".pages-next")).click();
		for (int i = 0; i <= pagination.size(); i++) {
			Thread.sleep(500);
			System.out.println(driver.getTitle());
			if (i < pagination.size()) {
				driver.findElement(By.cssSelector(".pages-next")).click();
			} else {
				System.out.println("All titles are printed");
				driver.close();
			}

		}
	}
}
