package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * this class conatins resuable methods of java
 * @author prash
 *
 */

public class JavaUtility {
	/**
	 * this method generate random number
	 * @param limit
	 * @return
	 */
	
	public int generateRandomNumber(int limit) {
		Random random=new Random();
		return random.nextInt(limit);
	}
	/***
	 * this method is used to fetch the current date and time
	 * **
	 */
public static String getCurrentTime() {
	Date date=new Date();
	SimpleDateFormat sof= new SimpleDateFormat("dd_mm_yyyy_hh_mm_sss");
	return sof.format(date);
	
	
}
}
