package propergtiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataDFromPropertiesFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		//step1:convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/ddt1.xlsx");
		
		//step2:Create an instance for properties class
		//Properties class is available in java.util.package
		Properties property=new Properties();
		
		System.out.println(); 
		
		
	}

}
