package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();//--> for setup the chrome driver
		ChromeDriver driver4= new ChromeDriver();//-->launch the browser
		driver4.get("https://en-gb.facebook.com/");//-->load URL
		driver4.manage().window().maximize();
		driver4.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver4.findElement(By.linkText("Create New Account")).click();
		driver4.findElement(By.name("firstname")).sendKeys("Thenmozhi");
		driver4.findElement(By.name("lastname")).sendKeys("Kavin");
		driver4.findElement(By.xpath("//input [@aria-label='Mobile number or email address']")).sendKeys("9563254100");
		driver4.findElement(By.xpath("//input [@id='password_step_input']")).sendKeys("Welcome@123");
		WebElement ele1 = driver4.findElement(By.name("birthday_day"));
		Select element1 = new Select(ele1);
		element1.selectByVisibleText("10");
		WebElement ele2 = driver4.findElement(By.name("birthday_month"));
		Select element2 = new Select(ele2);
		element2.selectByVisibleText("May");
		WebElement ele3 = driver4.findElement(By.name("birthday_year"));
		Select element3 = new Select(ele3);
		element3.selectByVisibleText("1995");
		driver4.findElement(By.xpath("//label [text()='Female']")).click();
		driver4.findElement(By.name("websubmit")).click();
			
	}

}
