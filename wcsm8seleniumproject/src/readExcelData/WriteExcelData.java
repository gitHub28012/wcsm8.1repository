package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("IPL");
		 Row row = sheet.getRow(1);
		 
		 Cell cell = row.createCell(2); // is use to create the cell
		 cell.setCellValue("BCCI"); // set the value in that cell
		 
		 
		 FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		 wb.write(fos);
		
	}

}
