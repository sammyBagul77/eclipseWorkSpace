package prgrms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		//1. Absolute path
//		String path = System.getProperty("user.dir")+"\\PropertyFiles\\text.properties";
		
		//2. Absolute path
//		FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Property\\PropertyFiles\\text.properties");

		//3. Absolute path
//		FileInputStream f2 = new FileInputStream(path);
		
		//4.relative path
		FileInputStream f3 = new FileInputStream(".\\PropertyFiles\\text.properties");
		
		Properties pro =new Properties();
//		//loading property file
		pro.load(f3);
		
		//Reading Data from Property file using get property
		System.out.println("username: "+ pro.getProperty("Username"));
		System.out.println("password: "+ pro.getProperty("Password"));
		System.out.println("url: "+ pro.getProperty("Url"));
		System.out.println("Link: "+ pro.getProperty("Name"));
	}

}
