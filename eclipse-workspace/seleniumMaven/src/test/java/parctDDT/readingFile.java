package parctDDT;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class readingFile {
@Test
public void readsheetDet() throws IOException{
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\testFile.xlsx");
	// create an instance of required workbook class and pass FileInputStream
	// instance to its constructor
	Workbook workbook = new XSSFWorkbook(fis);
	// get the number of sheets present in the excel
	 int sheetCount = workbook.getNumberOfSheets();
	System.out.println(sheetCount);
	// get the number of sheetName present in the excel
	for(int i =0; i<sheetCount;i++){
		System.out.println(workbook.getSheetName(i));
	}
	System.out.println("******************************************");
	Sheet sheet = workbook.getSheet("Sheet1");
	// get the number of rows present in the excel
	int rowCount = sheet.getLastRowNum();
	System.out.println("Total count of row: "+rowCount);
}
public void readRowdet() throws IOException{
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\testFile.xlsx");
	// create an instance of required workbook class and pass FileInputStream
	// instance to its constructor
	Workbook workbook = new XSSFWorkbook(fis);
	// get the number of sheets present in the excel
	 int sheetCount = workbook.getNumberOfSheets();
	System.out.println(sheetCount);
	
	System.out.println("******************************************");
	Sheet sheet = workbook.getSheet("Sheet1");
	// get the number of rows present in the excel
	int rowCount = sheet.getLastRowNum();
	System.out.println("Total count of row: "+rowCount);//totalSheetCount =actCount-1
	Row row = sheet.getRow(0);
	System.out.println(row.getCell(1));
}
}
