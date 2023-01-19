package xpathCon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContainsText {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//a[contains(@title,'Read')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	    driver.quit();
	
	
	}

}
