package ChromeOptionPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StratMaximisedBrowser {
	public static void main(String[] args) {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		 
		option.addArguments("--disable-notifications");


		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.yatra.com/flights");
		System.out.println("maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.quit();

	}

}
