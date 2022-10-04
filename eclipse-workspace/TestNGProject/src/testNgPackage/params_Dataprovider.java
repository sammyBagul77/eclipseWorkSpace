package testNgPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class params_Dataprovider {
	
	@Test(dataProvider ="getdata")
	public void inserting_data(String browser, String username,String password) {
		 System.out.println("Browser Name: "+ browser);
		 System.out.println("Username: "+ username);
		 System.out.println("Password:"+ password);
	}
	
	
	
	@DataProvider
	public Object[][] getdata(){

		Object[][] data = new Object[3][3];
		// first row
		data[0][0] = "chrome";
		data[0][1] = "admin";
		data[0][2] = "Test@123";

		// 2nd row
		data[1][0] = "chrome";
		data[1][1] = "admin";
		data[1][2] = "123";

		// 3rd row
		data[2][0] = "chrome";
		data[2][1] = " ";
		data[2][2] = "Test@123";
		
		return data;

	}
}
