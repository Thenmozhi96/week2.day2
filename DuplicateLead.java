package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(6000);
		String name1=driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String name2=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(name1.equals(name2))
		{
				System.out.println(name1);
		}
		driver.close();
	}

}
