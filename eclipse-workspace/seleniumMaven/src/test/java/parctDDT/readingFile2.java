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

public class readingFile2 {
@Test
public void readCell() throws IOException {
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\testFile.xlsx");
	
	Workbook workbook = new XSSFWorkbook(fis);
	System.out.println("Total Number of sheets in workbook: "+workbook.getNumberOfSheets());
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	Row row = sheet.getRow(0);
	System.out.println("Total numbers of cells in row 0:" +row.getLastCellNum());
	
	for(int i =0; i<row.getLastCellNum();i++) {
		System.out.println(row.getCell(i).getStringCellValue());
	}
	
	Cell cell = row.getCell(2);
	System.out.println("Data in cell 2: "+ cell.getStringCellValue());
	
	
}    
}
