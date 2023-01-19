package xpathCon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
		 
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Organizations')]")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("oakhigh18776");
		driver.findElement(By.xpath( "//input[@class='crmbutton small save']")).click();
		Thread.sleep(5000);
		
		
			
		////////task3////
		//driver.findElement(By.xpath( "a[contains(@class,'hdrLink')]")).click();
		
	//	driver.findElement(By.xpath("//body[@class='small']")).click();
	//	WebElement dd=driver.findElement(By.id("selectCurrentPageRec"));
	//	Select select=new Select(dd);
	//	List<WebElement> options = select.getOptions();
	//	for(int i=0;i<=options.size();i++)
		//{
	//		select.selectByIndex(i);
	//	}
		
		
		//select.getOptions();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		driver.quit();
	}
}
