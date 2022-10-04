package prgrms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readWriteFile {
	public static void main(String[] args) throws IOException {
String path  = System.getProperty("user.dir")+"\\PropertyFiles\\text.properties";
FileInputStream fis2 =new FileInputStream(path);

Properties prop = new Properties();
prop.load(fis2);

System.out.println("username:" + prop.getProperty("Username"));
System.out.println("pass:" + prop.getProperty("Password"));
System.out.println("url:" + prop.getProperty("Url"));
System.out.println("name:" + prop.getProperty("Name"));

//write in file
prop.setProperty("Application", "Java");
prop.setProperty("Now_Using", "Selenium");

//location where you want to save your file using FileOutputStream
FileOutputStream fos= new FileOutputStream(".\\PropertyFiles\\text.properties");
//saving the file into required location using store()
prop.store(fos, "Added two new keys");
fos.close();
}
	}
