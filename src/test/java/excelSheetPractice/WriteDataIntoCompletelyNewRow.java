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

public class WriteDataIntoCompletelyNewRow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/NumData.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Sheet1");
	//creates new row by deleteing older data in the row
	Row row=sheet.createRow(3);
	
	//creates new Cell by deleteing older data in the cell
	Cell cell=row.createCell(0);
	
	//write data into cell
	cell.setCellValue("HIjj");
 	//save data into excel
	FileOutputStream fos=new FileOutputStream("./src/test/resources/NumData.xlsx");
	wb.write(fos);
	
	wb.close();
	
}
}
