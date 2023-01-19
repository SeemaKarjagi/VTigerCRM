package ChromeOptionPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveChromeAutomationMSG {
public static void main(String[] args) {
	ChromeOptions option=new ChromeOptions();
	option.setExperimentalOption("excludeSwitches",new String [] {"enable-automation"});
	 

	WebDriver driver=new ChromeDriver(option);
}
}

//allow access mode for mic test