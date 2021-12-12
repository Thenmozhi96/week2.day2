package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Thenmozhi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@type='submit'][@value='Update']")).click();
		String companyname=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(companyname.contains("TCS"))
		{
			System.out.println(companyname);
		}
		else
		{
			System.out.println("Text are not matching");
		}
		
		driver.close();
	}
		
}


