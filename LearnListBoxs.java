package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxs {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element1=driver.findElement(By.id("dropdown1"));
		Select ele1=new Select(element1);
		ele1.selectByIndex(1);
		Thread.sleep(3000);
		WebElement element2=driver.findElement(By.name("dropdown2"));
		Select ele2=new Select(element2);
		ele2.selectByVisibleText("Selenium");
		WebElement element3=driver.findElement(By.id("dropdown3"));
		Select ele3=new Select(element3);
		ele3.selectByValue("1");
		WebElement element4=driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select ele4=new Select(element4);
		int number=ele4.getOptions().size();
		System.out.println("The number of options present "+ number);
		ele4.selectByVisibleText("Selenium");
		Thread.sleep(3000);
		WebElement element5=driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select"));
		Select ele5=new Select(element5);
		int j=ele5.getOptions().size();
		for(int i=0;i<=j;i++)
		{
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys((Keys.ARROW_DOWN));
			if(i==3)
			{
			driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).click();	
			}
		}
		for(int i=0;i<=j;i++)
		{
		driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select")).sendKeys(Keys.ARROW_DOWN);
			if(i==3)
			{
			driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select")).click();
			}
		
		}
		
	}

}
