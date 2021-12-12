package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//--> for setup the chrome driver
		ChromeDriver driver2= new ChromeDriver();//-->launch the browser
		driver2.get("http://leaftaps.com/opentaps");//-->load URL
		driver2.manage().window().maximize();
		String tit = driver2.getTitle();
		System.out.println(tit);
		driver2.findElement(By.id("username")).sendKeys("democsr");
		driver2.findElement(By.id("password")).sendKeys("crmsfa");
		driver2.findElement(By.className("decorativeSubmit")).click();
		driver2.findElement(By.linkText("CRM/SFA")).click();
		driver2.findElement(By.linkText("Contacts")).click();
		driver2.findElement(By.linkText("Create Contact")).click();
		driver2.findElement(By.id("firstNameField")).sendKeys("Thenmozhi");
		driver2.findElement(By.id("lastNameField")).sendKeys("S");
		driver2.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Thenmozhi");
		driver2.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
		driver2.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer Science");
		driver2.findElement(By.id("createContactForm_description")).sendKeys("working in computerscience department");
		driver2.findElement(By.id("createContactForm_primaryEmail")).sendKeys("thenmozhis@gmail.com");
		WebElement ele1=driver2.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select element1=new Select(ele1);
		element1.selectByVisibleText("India");
		Thread.sleep(3000);
		WebElement ele2=driver2.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select element2=new Select(ele2);
		element2.selectByValue("IN-TN");
		driver2.findElement(By.className("smallSubmit")).click();
		driver2.findElement(By.linkText("Edit")).click();
		driver2.findElement(By.id("updateContactForm_description")).clear();
		driver2.findElement(By.id("updateContactForm_importantNote")).sendKeys("verify all the given informations");
		driver2.findElement(By.xpath("//input[@value='Update']")).click();
		String tit1 = driver2.getTitle();
		System.out.println(tit1);
		driver2.close();
	}

}
