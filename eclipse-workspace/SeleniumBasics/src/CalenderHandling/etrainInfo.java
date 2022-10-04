package CalenderHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class etrainInfo {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://etrain.info/in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(2000);
	WebElement from = driver.findElement(By.id("tbsfi1"));
	from.click();
	Thread.sleep(1000);
	from.sendKeys("PUNE");
    driver.findElement(By.xpath("//b[text() ='PUNE'][1]")).click();
	
    WebElement to = driver.findElement(By.name("station2"));
	to.click();
	Thread.sleep(1000);
	to.sendKeys("MUMBAI CST");
	driver.findElement(By.cssSelector("div#suggest_row1>a>*:nth-of-type(1)")).click();
	
	driver.findElement(By.id("tbsfi4")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[class='nav']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".dpdd>table tr:nth-of-type(4) td:nth-of-type(3)")).click();
	driver.findElement(By.cssSelector("#tbsfi5>option:nth-of-type(2)")).click();
	
	List<WebElement> TrainList =driver.findElements(By.cssSelector(".trainlist.rnd5>table>tbody>tr>td:nth-of-type(2)"));
	System.out.println(TrainList.size());
	Thread.sleep(2000);
	List<String> trainl = new ArrayList<String>();
			for(int i =0;i<TrainList.size();i++) {
				trainl.add(TrainList.get(i).getText());
			}
			for(int i =0;i<TrainList.size();i++) {
				System.out.println(trainl.get(i));
			}
			
			for(WebElement Train: TrainList) {
				System.out.println(Train.getText());
			}
			
	}
}
