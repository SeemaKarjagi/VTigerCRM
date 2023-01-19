package excelSheetPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 

public class ReadDataFromExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//step1:convert physical file to java readable object
	FileInputStream fis=new FileInputStream("./src/test/resources/ddt1.xlsx");
	
	//step2:open the excel workbook
	//impoert workbook from org.apache.poi.ss.usermodel
	//the below statment throws EncryptedDocumentException and IOException
	Workbook wb=WorkbookFactory.create(fis);
	
	//step3: get control over particular sheet
	Sheet sheet=wb.getSheet("Sheet1");
	//step4: get control over particular Row
	Row row=sheet.getRow(0);
	//step5: get control over particular cell
	Cell cell=row.getCell(1);
	
	//step6: Fetch data from Cell
	System.out.println(cell.getStringCellValue());
	
	//step7:close workbook
	wb.close();
	
	
	
	
}
}
