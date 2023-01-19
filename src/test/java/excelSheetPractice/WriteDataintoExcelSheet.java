package excelSheetPractice;

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

public class WriteDataintoExcelSheet {public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/ddt1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Sheet1");
	
	Row row=sheet.getRow(2);
	//creates new Cell by deleteing older data in the cell
	Cell cell=row.getCell(1);
	
	//write data into cell
	cell.setCellValue("HI");
	
	//save data into excel
	FileOutputStream fos=new FileOutputStream("./src/test/resources/ddt1.xlsx");
	wb.write(fos);
	
	wb.close();
}

}
