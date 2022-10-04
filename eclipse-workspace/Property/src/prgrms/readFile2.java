package prgrms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readFile2 {
	public static void main(String[] args) throws IOException   {
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Property\\PropertyFiles\\text.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println("username:" + prop.getProperty("Username"));
		System.out.println("pass:" + prop.getProperty("Password"));
		System.out.println("url:" + prop.getProperty("Url"));
		System.out.println("name:" + prop.getProperty("Name"));
		
		String Amt = prop.getProperty("Amount");
		System.out.println("Amoun in string datatype:"+Amt);
		
		//converting amount into integer
		int amount = Integer.parseInt(Amt);
		
	int	roi = amount/10; 
		System.out.println("Rate Of Interest: " +roi);
		
	}
}
