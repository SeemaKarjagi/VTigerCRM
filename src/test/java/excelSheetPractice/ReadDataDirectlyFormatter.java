package excelSheetPractice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataDirectlyFormatter {
	FileInputStream fis=new FileInputStream("./src/test/resources/ddt1.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	DataFormatter df=new DataFormatter();
	
	System.out.println(df.formatCellValue(wb.getSheet("Sheet1").getRow(3).getCell(0)));
	System.out.println((df.formatCellValue(wb.getSheet("Sheet1").getRow(0).getCell(1)));



}
