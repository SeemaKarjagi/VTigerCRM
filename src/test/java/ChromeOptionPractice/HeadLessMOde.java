package ChromeOptionPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMOde {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments(" --headless");
		 

		WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.yatra.com/flights");//here execution happens faster
	  //whenever we are having n number of scipts and u want just pass of failed scripts in that time u will use this head;less
	  //when we are intrested on final result 
	}

}
