package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods related to actions performed
 * @author prash
 *fos=null , in memory it will be null intialilly,it ia=s local variable whic is need to be intialise the variable s 
 *path  ,key,parametrs etc-we are asking user to peovide the path bcz diff application will be having diff path so it is easy to implemnt
 *let user pass the parameters
 *here we are using 3 methods-initilising,writting,read
 */
public class PropertiesFileUtility {
	private Properties property;
	/**
	 * this method is used to intialize properties file
	 * @param path 
	 * @param path
	 * @return
	 */
	public void propertiesFileIntialialization(String path)
	{FileInputStream fis=null;
		try {
			 fis=new FileInputStream(path);//right click on path and add to parameters and dont throws the exception instead click on try andcatch block
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		property=new Properties();
		

try {
	property.load(fis);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}
/**
 * this method is used to fetch data from properties file
 * @param key
 * @return
 */
		public String fetchProperty(String key)
		{
			return property.getProperty(key);
		
		}
		/**
		 * this method is used to modify the Properties file
		 * @param key
		 * @param value
		 * @param path
		 */
		public void modifyPropertiesFile(String key, String value, String path) {
			property.put(key, value);
			FileOutputStream fos=null;
			try {
			fos=new FileOutputStream(path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void propertyFileInitialization(String propertyFilePath) {
			// TODO Auto-generated method stub
			
		}}
	 