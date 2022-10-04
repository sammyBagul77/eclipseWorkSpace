package PopuP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.SeleniumUtility;

public class popUpHandling {
	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, 8);

		// alert PopUp
		driver.findElement(By.cssSelector("#alertButton")).click();
		System.out.println("Msg of AlertPopUp: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// alert 5sec PopUp
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#timerAlertButton")));
		driver.findElement(By.cssSelector("#timerAlertButton")).click();
		Thread.sleep(5001);
		System.out.println("Msg of TimeAlertPopUp: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// confirmPopup
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmButton")));
		driver.findElement(By.cssSelector("#confirmButton")).click();
		Thread.sleep(1000);
		System.out.println("Msg of ConfirmPopUp: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// PromptPopup
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#promtButton")));
		driver.findElement(By.cssSelector("#promtButton")).click();
		Thread.sleep(1000);
		System.out.println("Msg of promtPopUp: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("sam");
		driver.switchTo().alert().accept();
	}
}
