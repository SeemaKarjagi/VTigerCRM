package genericLibraries;
/**
 * firsly we need to create one genericLibraries package in  src/main/java after that create Iconstant interface and PropertiesFileUtility class to write the scripts
 */
/**
 * this interface stores all the file paths used in theframewoek
 * @author prash
 * IConstantPath it is a interface
 *
 */
public interface IConstantPath {
	String PROPERTY_FILE_PATH="./src/test/resources/commonData.properties";
	String EXCEL_FILE_PATH="./src/test/resources/ddt1.xlsx";
	String DATABASE_URL ="jdbc:mysql://localhost:3306/adselenium";
}
