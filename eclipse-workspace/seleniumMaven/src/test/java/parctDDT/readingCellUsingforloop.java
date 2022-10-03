package parctDDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class readingCellUsingforloop {
	public void cellforLoop() throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\AppData\\testFile.xlsx");

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(3);

		for (int i = 0; i < row.getLastCellNum(); i++) {
			Cell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case (Cell.CELL_TYPE_STRING):
				System.out.println("Cell no("+(i+1)+"): "+cell.getStringCellValue());
				break;
			case (Cell.CELL_TYPE_NUMERIC):
				System.out.println("Cell no("+(i+1)+"): "+cell.getNumericCellValue());
				break;
			case (Cell.CELL_TYPE_BOOLEAN):
				System.out.println("Cell no("+(i+1)+"): "+cell.getBooleanCellValue());
				break;

			default:
				System.out.println("Invalid Cell Details");
				break;
			}
		}
	}
}