package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * thia class contains all the resuable , methosds to perform opertaions on
 * excel
 * 
 * @author prash
 *
 */

public class ExcelUtility {
	 
	private Workbook workbook;
	private DataFormatter df;
	private Sheet sheet;

	/**
	 * This method initializes excel workbook
	 * 
	 * @param path
	 */
	public void excelInitialization(String path) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to fetch single data from excel
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String readDataFromExcel(String sheetName, int rowNum, int cellNum) {
		df = new DataFormatter();
		sheet = workbook.getSheet(sheetName);
		return df.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
	}

	/**
	 * This method is used to write data in to excel
	 * 
	 * @param data
	 * @param cellNum
	 * @param rownum
	 * @param path
	 */
	public void setDataToExcel(String data, int cellNum, int rownum, String path) {
		Cell cell = sheet.getRow(rownum).createCell(cellNum);
		cell.setCellValue(data);

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to close excel workbook
	 */
	//public void closeWorkbook() {
		//try {
		//	workbook.close();
	//	} catch (IOException e) {
	//		e.printStackTrace();
		//}
	
	 /**
	  * This method is used to update test status in to excel workbook
	  * @param expectedTestName
	  * @param status
	  * @param path
	  */
	 public void setDataToExcel(String expectedTestName, String status, String path) {
		for(int i=0; i< sheet.getLastRowNum();i++) {
			if(df.formatCellValue(sheet.getRow(i).getCell(1)).contains(expectedTestName)) {
				sheet.getRow(i).getCell(4).setCellValue(status);
			}
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to close excel workbook 
	 */
	public void closeWorkbook() {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setDataToExcel(String string, String string2, String excelFilePath, String string3) {
		// TODO Auto-generated method stub
		
	}
}
