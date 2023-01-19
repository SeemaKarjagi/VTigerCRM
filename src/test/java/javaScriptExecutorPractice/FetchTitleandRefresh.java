package javaScriptExecutorPractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleandRefresh {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location=arguments[0]","https://www.amazon.com/");
	Thread.sleep(2000);
	
	System.out.println(js.executeScript( "return document.title"));
	System.out.println(js.executeScript("return document.URL" ));
	
	Thread.sleep(2000);
	js.executeScript("history.go(0)");
	driver.quit();

}
}
