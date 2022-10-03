package SelectDropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class autoTesting {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
	
    FirefoxDriver f = new FirefoxDriver();
    f.get("https://demo.automationtesting.in/Register.html");
    f.manage().window().maximize();
    f.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    WebElement skills = f.findElement(By.id("Skills"));
    
  //**** Create an instance of Select class and pass above element into its constructor
    Select skillDrop = new Select(skills);
    
    //checking dropdown is multiselect or not
    System.out.println("Dropdown is multiselect: "+ skillDrop.isMultiple());
    
    //*** get default or already select option
   WebElement selectedOption = skillDrop.getFirstSelectedOption();
   String SelectedOpt = selectedOption.getText();
   System.out.println(SelectedOpt);
    //OR
   System.out.println("Default Option: "+skillDrop.getFirstSelectedOption().getText());
   
   //get option count 
   List<WebElement> li = skillDrop.getOptions();
   System.out.println("Size Of Options:" + li.size());
   Thread.sleep(1000);
   for(int i = 0; i<li.size();i++) {
	   System.out.println("Option "+ i +": "+li.get(i).getText());
	   
   }
   //TODO: validation dropdown skills are getting displayed in ascending order


   
   //SelectByIndex
   skillDrop.selectByIndex(4);
   System.out.println("Already selected Option:"+ skillDrop.getFirstSelectedOption().getText());
   
   //selectByValue
   skillDrop.selectByValue("AutoCAD");
   System.out.println("Already selected Option:"+ skillDrop.getFirstSelectedOption().getText());
   
   //selectByVisibleText
   skillDrop.selectByVisibleText("APIs");
   System.out.println("Already selected Option:"+ skillDrop.getFirstSelectedOption().getText());
   

   
    
}
}
