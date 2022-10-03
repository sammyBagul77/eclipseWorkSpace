package CssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeTasks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.titleContainer>div.addNewContainer>div.addNewButton>div:nth-of-type(1)")).click();
		driver.findElement(By.cssSelector("div.dropdownContainer.addNewMenu>div:nth-of-type(3)")).click();

		driver.findElement(By.cssSelector("tr.selectCustomerRow>td>div.customerSelector>div>.comboboxButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"div.customerSelector div.scrollableDropdownView>.scrollableContainer>.contentWrapper>.searchItemList>div:nth-of-type(4)"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.projectSelector>div.cpCombobox .dropdownButton")).click();
		driver.findElement(By.cssSelector(
				"div.projectSelector>div.cpCombobox>.scrollableDropdownView>.scrollableContainer   .searchItemList>div:nth-of-type(4)")).click();

		// Task Name
		WebElement name = driver.findElement(By.cssSelector(
				"#createTasksPopup tbody>tr:nth-of-type(1)>.nameCell.first>input[placeholder='Enter task name']"));
		name.click();
		name.sendKeys("Testing");

		// Deadline
		driver.findElement(By.cssSelector("#createTasksPopup tbody>tr:nth-of-type(1)>td:nth-of-type(4)")).click();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("ul>li>div>table>tbody tr>.x-date-middle>table>tbody>tr>td:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector("#ext-gen110")).click();
		driver.findElement(By.cssSelector("#ext-gen143")).click();
		
		//create task
		driver.findElement(By.cssSelector("#createTasksPopup_content>*:nth-of-type(2)>*:nth-of-type(2)>div>div>div:first-child")).click();
		driver.findElement(By.cssSelector(".createdTasksTableContainer .taskRow.noLastTrackingDate>td.selection")).click();
		
		//deleting task
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".bulkOperationsPanel div.delete")).click();
		driver.findElement(By.cssSelector(".deleteDialog .operationConfirmDialogInnerContainer>div:nth-of-type(5)>div>div>span")).click();
		
		WebElement task =driver.findElement(By.cssSelector("div>div:nth-of-type(2) .searchFieldContainer .containerTable tr>td:nth-of-type(1)>div>input[placeholder='Start typing name ...']"));
		task.click();
		task.sendKeys("Testing");
		
//		if(driver.get) {
//			System.out.println("Your Task Is Deleted");
//		}else {
//			System.out.println("Not Deleted");
//		}
		

	}

}
