package seleniumMavenProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class globalSqaDragDrop {
   public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	 
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  Actions act = new Actions(driver);
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".demo-frame.lazyloaded")));
	  WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
	  driver.switchTo().frame(frame);
	  
	  WebElement trash = driver.findElement(By.cssSelector("#trash"));
	 
	 
	  List<WebElement> src = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
 
//	   act.dragAndDrop(src.get(0), trash).build().perform();
//	   Thread.sleep(500);
//	   act.dragAndDrop(src.get(1), trash).build().perform();
//	   Thread.sleep(500);
//	   act.dragAndDrop(src.get(2), trash).build().perform();
//	   Thread.sleep(500);
//	   act.dragAndDrop(src.get(3), trash).build().perform();

	  //OR
	  
	   for(int i =0; i<src.size();i++) {
		   act.dragAndDrop(src.get(i), trash).perform();
		   Thread.sleep(500);
	   }
	  
}
}
