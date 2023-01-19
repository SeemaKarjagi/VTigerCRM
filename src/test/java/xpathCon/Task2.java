package xpathCon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
        //LOGIN TO Vtiger crm//
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		
		 //WebElement element = 
		//click on contacts 
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		//create new contacts
		driver.findElement(By.xpath("//img[contains(@title,'Create Contact...')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("hsgyhgdhg");//provide necessary details
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("oakarja");
		driver.findElement(By.xpath("//input[contains(@title,'Save [Alt+S]')]")).click();//click on save button
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();//sign out
		
		driver.quit();//close the window
		


	}}
