package excelSheetPractice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataDirectlyFromExcelSheet {
	//step1:convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/ddt1.xlsx");
		
		//step2:open the excel workbook
		//impoert workbook from org.apache.poi.ss.usermodel
		//the below statment throws EncryptedDocumentException and IOException
		Workbook wb=WorkbookFactory.create(fis);
		
	
		DataFormatter df=new DataFormatter();
		
		System.out.println((df.formatCellValue(wb.getSheet("Sheet1").getRow(0).getCell(1)));
//(df.formatCellValue(getSheet("Sheet1").getRow(0).getCell(1)));
		 
		String data=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
		//step2:close Woekbook
		wb.close();
		
			

}

}}
