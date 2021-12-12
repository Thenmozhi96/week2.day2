package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DeleteLead
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("04");
	driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("22");
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2696533");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	String text1=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
	System.out.println(text1);
	driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text1);
    driver.findElement(By.xpath("//button [text()='Find Leads']")).click();
    Thread.sleep(3000);
    String text2=driver.findElement(By.xpath("(//div[text()='No records to display'])[1]")).getText();
     String text3="No records to display";   
     //System.out.println(text2);
     //System.out.println(text3);
   if (text2.equals(text3)) 
    {
		System.out.println("Deleted ID is: "+ text1);
	} 
    
    else
    {
	   System.out.println("Record Not deleted");
    }
    
   // driver.close();
}
}

