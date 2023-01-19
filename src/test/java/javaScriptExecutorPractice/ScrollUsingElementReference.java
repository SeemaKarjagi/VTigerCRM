package javaScriptExecutorPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingElementReference {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		WebElement toys=driver.findElement(By.xpath("//img[@alt='New arrivals in Toys']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript( "arguments[0].scrollIntoview(true)",toys);
		Thread.sleep(2000);
		driver.quit();

}}
