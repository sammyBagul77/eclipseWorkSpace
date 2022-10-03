package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
// here if we use priority with test cases then methods will executes prioritywise
public class priority {
	@Test(priority=1,description="Open browser and enter URL")
	public void openBrowserAndAppURL() {
		System.out.println("Open browser and enter app url");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("enter username, password and click on login button");
	}
	@Test(priority=3)
	public void createTask() {
		System.out.println("create new task");
	}
	@Test(priority=4)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
